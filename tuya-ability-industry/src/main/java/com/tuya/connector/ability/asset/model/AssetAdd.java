package com.tuya.connector.ability.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AssetAdd implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String name;
    //private String metaId;
    private String parentAssetId;
}