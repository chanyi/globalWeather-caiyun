package com.simba.weather.model.enumType;

import com.simba.weather.model.ReturnBackResult;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Array;
public enum  SkyconEnum {
    CLEAR_DAY("CLEAR_DAY","晴(白天)"),
    CLEAR_NIGHT("CLEAR_NIGHT","晴(夜间)"),
    PARTLY_CLOUDY_DAY("PARTLY_CLOUDY_DAY","多云(白天)"),
    PARTLY_CLOUDY_NIGHT("PARTLY_CLOUDY_NIGHT","多云(夜间)"),
    CLOUDY("CLOUDY","阴"),
    WIND("WIND","大风"),
    HAZE("HAZE","雾霾"),
    RAIN("RAIN","雨"),
    SNOW("SNOW","雪");
    private String code;
    private String desc;

    SkyconEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
