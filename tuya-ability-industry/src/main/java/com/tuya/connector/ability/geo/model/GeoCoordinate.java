package com.tuya.connector.ability.geo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description 地理位置-经纬度
 * @author benguan.zhou@tuya.com
 * @date 2021/05/22
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class GeoCoordinate implements Serializable {
    protected static final long serialVersionUID = 1L;
    String longitude;
    String latitude;
}
