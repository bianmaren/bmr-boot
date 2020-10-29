package com.bianmaren.common;

import com.bianmaren.common.enums.MessageEnum;

import java.util.HashMap;

/**
 * @author bianmaren
 * @Description: 通用消息类
 * @mail 441889070@qq.com
 * @date 2020/8/14
 */
public class Message extends HashMap<String, Object> {

    private static final String CODE = "code";
    private static final String MESSAGE = "msg";

    public Message() {
        put(CODE, MessageEnum.SUCCESS.getCode());
        put(MESSAGE, MessageEnum.SUCCESS.getMsg());
    }

    public Message(Integer code, String message) {
        put(CODE, code);
        put(MESSAGE, message);
    }

    public Message(MessageEnum messageEnum) {
        put(CODE, messageEnum.getCode());
        put(MESSAGE, messageEnum.getMsg());
    }

    public static Message success(MessageEnum message){
        return new Message(message);
    }
    public static Message success(){
        return new Message(MessageEnum.SUCCESS);
    }
    public static Message success(MessageEnum message,String msg){
        return new Message(message.getCode(),msg);
    }

    public static Message success(String msg){
        return new Message(MessageEnum.SUCCESS.getCode(),msg);
    }

    public static Message error(MessageEnum message){
        return new Message(message);
    }

    public static Message error(MessageEnum message,String msg){
        return new Message(message.getCode(),msg);
    }

    public static Message error(String msg){
        return new Message(MessageEnum.FAIL.getCode(),msg);
    }

}
