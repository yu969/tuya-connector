package com.tuya.connector.ability.user.connector;

import com.tuya.connector.ability.user.model.PasswordModify;
import com.tuya.connector.ability.user.model.PasswordReset;
import com.tuya.connector.ability.user.model.UserRegistry;
import com.tuya.connector.ability.user.model.User;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;

/**
 * @author benguan
 */
public interface UserConnector{

    @PUT("/v1.0/iot-02/users/{user_id}")
    Boolean modifyUserPassword(@Path("user_id") String userId, @Body PasswordModify request);

    @PUT("/v1.0/iot-02/users/reset-password")
    Boolean resetPassword(@Body PasswordReset req);

    @POST("/v1.0/iot-02/users")
    User registeredUser(@Body UserRegistry req);

    @GET("/v1.0/iot-02/users/{user_id}")
    User selectUser(@Path("user_id") String userId);
}
