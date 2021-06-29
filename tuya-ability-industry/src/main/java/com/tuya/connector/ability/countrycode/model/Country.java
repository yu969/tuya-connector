package com.tuya.connector.ability.countrycode.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Country implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 国家码
     */
    String countryCode;

    /**
     * 国家区号
     */
    String nationalNumber;

    /**
     * 国家名称
     */
    String countryName;

    /**
     * 国家的拼音
     */
    String countryPhoneticAlphabet;

}