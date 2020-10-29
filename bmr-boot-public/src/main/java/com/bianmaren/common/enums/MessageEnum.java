package com.bianmaren.common.enums;

/**
 * @author bianmaren
 * @Description: 消息枚举类
 * @mail 441889070@qq.com
 * @date 2020/8/14
 */

public enum MessageEnum {

    /**
     * 消息内容
     */
    SUCCESS(0, "操作成功"),
    FAIL(1, "操作失败");

    private final Integer code;
    private final String msg;

    MessageEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
