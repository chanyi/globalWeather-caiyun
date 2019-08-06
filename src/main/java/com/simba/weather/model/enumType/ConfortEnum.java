package com.simba.weather.model.enumType;

public enum ConfortEnum {
    Sticky(0,"Sticky","闷热"),
    Extremely(1,"Extremely","酷热"),
    VeryHot(2,"VeryHot","很热"),
    Hot(3,"Hot","热"),
    Warm(4,"Warm","温暖"),
    Comfort(5,"Comfort","舒适"),
    Cool(6,"Cool","凉爽"),
    Cold(7,"Cold","冷"),
    VeryCold(8,"VeryCold","很冷"),
    Freezing(9,"Freezing","寒冷"),
    Frigid(10,"Frigid","极冷"),
    Icy(11,"Icy","刺骨的冷"),
    Clammy(12,"Clammy","湿冷"),
    Dry(13,"Dry","干冷");

    private int index;
    private String code;
    private String desc;

    ConfortEnum(int index ,String code, String desc) {
        this.index = index;
        this.code = code;
        this.desc = desc;
    }
    public int getIndex() {
        return index;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
