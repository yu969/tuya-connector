package com.tuya.connector.open.messaging.event;

import com.alibaba.fastjson.JSONObject;
import com.tuya.connector.open.messaging.SourceMessage;

/**
 * @description: 房间排序
 * @author: jinyun.zhou@tuya.com
 * @create: 2021-03-24 23:07
 **/
public class RoomSortMessage extends BaseTuyaMessage {

    public static final String HOME_ID = "homeId";
    public static final String ROOMS = "rooms";
    public static final String UID = "uid";
    public static final String TIME = "time";

    public RoomSortMessage(SourceMessage sourceMessage, JSONObject messageBody) {
        super(sourceMessage, messageBody);
    }

    @Override
    public String type() {
        return EventType.ROOM_SORT.getType();
    }
}
