package com.tuya.connector.industry.ability.weather.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AirQuality implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 空气质量指数
     */
    String aqi;

    /**
     * pm 2.5
     */
    String pm25;

    /**
     * pm 10
     */
    String pm10;

    /**
     * 二氧化硫
     */
    String so2;

    /**
     * 臭氧
     */
    String o3;

    /**
     * 二氧化氮
     */
    String no2;

    /**
     * 一氧化碳
     */
    String co;

}