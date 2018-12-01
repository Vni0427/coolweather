package com.example.asus.coolweather.gson;

/**
 * 包含当前空气质量情况
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
