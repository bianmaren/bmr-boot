package com.bianmaren.model.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bianmaren.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName : SysSetting
 * @Description : 系统设置表
 * @Author : bianmaren
 * @Date: 2020-08-20 23:41
 * @Blog: http://www.bianmaren.com
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_sys_setting")
public class SysSetting extends BaseModel {

    /**
     * 设置名称
     */
    private String settingName;

    /**
     * 设置键
     */
    private String settingKey;

    /**
     * 设置值
     */
    private String settingValue;


}
