package com.tuya.connector.ability.asset.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/15
 */
@Data
public class AssetModify implements Serializable {

    private static final long serialVersionUID = 4046817704993815783L;
    private String name;
    private String meta_id;

}
