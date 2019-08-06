package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultPrecipitationLocal {
    /**
     *状态 正常返回OK
     */
    private String status;
    /**
     * 本地降水强度（单位为雷达降水强度）
     */
    private double intensity;
    /**
     * 本地降水观测的数据源（radar，GFS）
     */
    private String datasource;

}
