package com.tuya.connector.industry.ability.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class PasswordReset implements Serializable {
    protected static final long serialVersionUID = 1L;

    String username;

    String newPassword;
}