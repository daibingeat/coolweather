package com.daibin.coolweather.gson;

/**
 * Created by DaiBin on 2018/11/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
