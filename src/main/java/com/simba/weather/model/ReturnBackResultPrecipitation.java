package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultPrecipitation {
    /**
     *最近的降水
     */
    private ReturnBackResultPrecipitationNearest nearest;
    /**
     * 本地降水
     */
    private ReturnBackResultPrecipitationLocal local;
}
