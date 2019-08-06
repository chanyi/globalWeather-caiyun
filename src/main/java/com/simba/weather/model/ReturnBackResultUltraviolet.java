package com.simba.weather.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ReturnBackResultUltraviolet {
    /**
     * 紫外线指数
     */
   private int index;
    /**
     * 描述
     */
   private String desc;
}
