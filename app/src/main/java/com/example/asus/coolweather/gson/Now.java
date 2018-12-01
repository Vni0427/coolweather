package com.example.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包含当前天气情况
 */
public class Now {

    @SerializedName("tmp")
    public String tempature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
