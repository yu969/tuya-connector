package com.tuya.connector.ability.device.status.connector;


import com.tuya.connector.ability.device.status.model.DeviceStatuses;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.Path;
import com.tuya.connector.api.annotations.Query;

import java.util.List;

/**
 * @author benguan
 */
public interface DeviceStatusQueryConnector {


    @GET("/v1.0/iot-03/devices/{device_id}/status")
    List<DeviceStatuses.DeviceStatus> selectDeviceStatus(@Path("device_id") String deviceId);

    @GET("/v1.0/iot-03/devices/status")
    List<DeviceStatuses> selectDeviceStatuses(@Query("device_ids") String deviceIds);

}