# globalWeather-caiyun
通过彩云api获取全球实时天气情况

执行步骤：

1. 在彩云官网注册账号，申请得到令牌token

2. 将token填写到application.properties文件的weather.caiyun.token后

3. 执行即可

4. 测试

   测试路径：http://127.0.0.1:7788/weather/get

   测试路径返回结果（返回值的说明信息在model文件下）：

     {
   "status": "ok",
   "lang": "zh_CN",
   "unit": "metric",
   "server_time": 1565075594,
   "location": [
       13,
       108
   ],
   "api_status": "active",
   "tzshift": 28800,
   "api_version": "v2.2",
   "result": {
       "status": "ok",
       "o3": 0,
       "co": 0,
       "temperature": 26.04,
       "pm10": 0,
       "skycon": "RAIN",
       "cloudrate": 0.87,
       "dswrf": 816.5,
       "visibility": 11.52,
       "humidity": 0.84,
       "so2": 0,
       "pres": 93551.59,
       "aqi": 0,
       "pm25": 0,
       "no2": 0,
       "apparent_temperature": 27.5,
       "precipitation": {
           "nearest": null,
           "local": {
               "status": "ok",
               "intensity": 0.2865,
               "datasource": "gfs"
           }
       },
       "ultraviolet": {
           "index": 1,
           "desc": "很弱"
       },
       "comfort": {
           "index": 3,
           "desc": "热"
       },
       "wind": {
           "direction": 254.04,
           "speed": 13.95
       }
   }
     }