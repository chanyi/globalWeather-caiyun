package com.simba.weather.controller;

import com.simba.weather.model.ReturnBack;
import com.simba.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @ResponseBody
    @RequestMapping("/get")
    public ReturnBack get(){
        //121.6544,25.1552
        return weatherService.getWeather("108.004628,13.852584");
    }
}
