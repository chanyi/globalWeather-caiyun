package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultComfort {
    /**
     *舒适度指数 0-13
     */
    private int index;
    /**
     *描述
     */
    private String desc;

}
