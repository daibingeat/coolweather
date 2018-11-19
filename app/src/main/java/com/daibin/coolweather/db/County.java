package com.daibin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DaiBin on 2018/11/19.
 */

public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weatherid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }
}
