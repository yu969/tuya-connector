package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AclRole {

    /**
     * 角色code
     */
    @SerializedName("roleCode")
    String roleCode;

    /**
     * 角色名字
     */
    @SerializedName("roleName")
    String roleName;

    /**
     * 隔离空间id
     */
    String spaceId;

    /**
     * 备注
     */
    String remark;

    List<AclPermission> permissionList;

}
