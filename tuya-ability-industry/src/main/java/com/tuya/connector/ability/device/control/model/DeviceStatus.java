package com.tuya.connector.ability.device.control.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/29
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class DeviceStatus implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String code;
    private String name;
    private String type;
    private String values;
}