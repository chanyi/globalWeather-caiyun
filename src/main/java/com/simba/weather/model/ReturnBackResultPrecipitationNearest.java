package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultPrecipitationNearest {
    /**
     *状态 正常返回OK
     */
    private String status;
    /**
     * 最近的降水带距离
     */
    private double distance;
    /**
     * 最近的降水带降水强度（单位为雷达降水强度）
     */
    private String intensity;
}
