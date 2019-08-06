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
public class ReturnBack {
    /**
     *返回结果状态，正常为ok
     */
    private String status;
    /**
     *语言
     * 默认为简体中文（zh_CN）、繁体中文（zh_TW）、美式英语（en_US）、英式英语（en_GB）
     */
    private String lang;
    /**
     *单位制
     * 默认为公制（metric）、科学单位体系（SI） 、英制（imperial）
     */
    private String unit;
    /**
     *服务器本次返回的utc时间戳
     */
    private long server_time;
    /**
     *经度在前，纬度在后，中间用半角逗号隔开，例如 [121.6544,25.1552]
     */
    private Integer[] location;
    /**
     *版本号状态
     */
    private String api_status;
    /**
     *时区的偏移秒数，如东八区就是 28800 秒
     * 默认为东八区，tzshift=28800；
     * 例如：印度东5.5区，tzshift=3600*5.5==19800，
     * 使用秒是为了支持像尼泊尔这样的差 5 小时 45 分钟的地区，它们有非整齐的偏移量；考虑了欧美夏令时
     */
    private int tzshift;
    /**
     *版本号
     */
    private String api_version;
    /**
     *详细结果
     */
    private ReturnBackResult result;
}
