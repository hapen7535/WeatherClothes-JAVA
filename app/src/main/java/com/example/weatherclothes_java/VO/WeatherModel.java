package com.example.weatherclothes_java.VO;


import java.util.List;

public class WeatherModel {

    private final String name;
    private final List<WeatherDetailModel> weather;
    private final WeatherMainModel main;
    private final WeatherWindModel wind;
    private final WeatherSysModel sys;
    private final WeatherCloudsModel clouds;

    public WeatherModel(String name, List<WeatherDetailModel> weather, WeatherMainModel main, WeatherWindModel wind, WeatherSysModel sys, WeatherCloudsModel clouds){
        this.name = name;
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.sys = sys;
        this.clouds = clouds;
    }

}
