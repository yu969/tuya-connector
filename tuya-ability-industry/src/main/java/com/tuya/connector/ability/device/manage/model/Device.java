package com.tuya.connector.ability.device.manage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Device implements Serializable {
    protected static final long serialVersionUID = 1L;
    private int activeTime;
    private String assetId;
    private String category;
    private int createTime;
    private String icon;
    private String id;
    private String ip;
    private String lat;
    private String localKey;
    private String lon;
    private String name;
    private boolean online;
    private String productId;
    private String productName;
    private boolean sub;
    private String timeZone;
    private int updateTime;
    private String uuid;
}