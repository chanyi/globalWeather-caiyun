package com.simba.weather.service;

import com.alibaba.fastjson.JSONObject;
import com.simba.weather.model.ReturnBack;
import com.simba.weather.model.configure.CaiyunToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherService {
    private final static Log logger = LogFactory.getLog(WeatherService.class);
    @Autowired
    private CaiyunToken caiyunToken;

    /**
     * 获取天气
     * @param location 比如：121.6544,25.1552
     * @return
     */
    public ReturnBack getWeather(String location) {
        logger.info("token：" + caiyunToken.getToken());
        String url = "https://api.caiyunapp.com/v2/"+ caiyunToken.getToken() +"/"+location+"/realtime.jsonp";
        String response = httpRequest(url, "GET", null);
        logger.info("response" + response);
        ReturnBack returnBack = JSONObject.parseObject(response, ReturnBack.class);
        return returnBack;
    }

    public static String httpRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod(requestMethod);
            conn.connect();
            //往服务器端写内容 也就是发起http请求需要带的参数
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
            }

            //读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
