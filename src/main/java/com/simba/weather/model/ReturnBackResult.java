package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Array;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResult {
    /**
     *实况模块返回状态 正常为ok
     */
    private String status;
    /**
     *臭氧，质量浓度值
     */
    private double o3;
    /**
     *一氧化碳，质量浓度值
     */
    private double co;
    /**
     *温度
     */
    private double temperature;
    /**
     * pm10，质量浓度值
     */
    private double pm10;
    /**
     *主要天气现象 具体值参照SkyconEnum枚举
     */
    private String skycon;
    /**
     *云量
     */
    private double cloudrate;
    /**
     *向下短波辐射通量
     */
    private double dswrf;
    /**
     *能见度
     */
    private double visibility;
    /**
     *相对湿度
     */
    private double humidity;
    /**
     *二氧化硫，质量浓度值
     */
    private double so2;
    /**
     *气压
     */
    private double pres;
    /**
     *AQI（国标）
     */
    private double aqi;
    /**
     * pm25，质量浓度值
     */
    private double pm25;
    /**
     * 二氧化氮，质量浓度值
     */
    private double no2;
    /**
     *表观温度
     */
    private double apparent_temperature;
    /**
     *降水情况
     */
    private ReturnBackResultPrecipitation precipitation;
    /**
     *紫外线指数及其自然语言描述
     */
    private ReturnBackResultUltraviolet ultraviolet;
    /**
     *舒适度指数及其自然语言描述
     */
    private ReturnBackResultComfort comfort;
    /**
     *风的信息（风速和风向）
     */
    private ReturnBackResultWind wind;

}
