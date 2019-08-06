package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultWind {
    /**
     *风向，单位是度。正北方向为0度，顺时针增加到360度。
     */
    private double direction;
    /**
     *风速，米制下是公里每小时
     */
    private double speed;

}
