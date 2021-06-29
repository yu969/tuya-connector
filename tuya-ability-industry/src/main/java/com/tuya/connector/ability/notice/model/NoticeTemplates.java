package com.tuya.connector.ability.notice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class NoticeTemplates implements Serializable {
    protected static final long serialVersionUID = 1L;

    private long total;

    private List<NoticeTemplate> list;

    private boolean hasMore;

}