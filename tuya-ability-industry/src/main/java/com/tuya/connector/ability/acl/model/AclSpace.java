package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AclSpace implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 空间分组
     */
    @SerializedName("spaceGroup")
    String spaceGroup;

    /**
     * 空间隔离标识
     */
    @SerializedName("spaceCode")
    String spaceCode;

    /**
     * 备注
     */
    String remark;

    /**
     * 鉴权扩展字段
     */
    Integer authentication;

    /**
     * 拥有者
     */
    List<String> ownerList;

}