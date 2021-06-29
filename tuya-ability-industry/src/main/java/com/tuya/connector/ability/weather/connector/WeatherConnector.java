package com.tuya.connector.ability.weather.connector;

import com.tuya.connector.ability.weather.model.CurrentWeather;
import com.tuya.connector.ability.weather.model.WeatherDailyForecast;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.Query;

/**
 * @description: 天气服务
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
public interface WeatherConnector {
    /**
     * 根据经纬度获取7日天气预报
     * */
    @GET("/v2.0/iot-03/weather/forecast/daily")
    WeatherDailyForecast dailyForecast(@Query("lon")String lon, @Query("lat")String lat);

    /**
     * 获取当前天气
     * */
    @GET("/v2.0/iot-03/weather/current")
    CurrentWeather currentWeather(@Query("lon")String lon, @Query("lat")String lat);
}