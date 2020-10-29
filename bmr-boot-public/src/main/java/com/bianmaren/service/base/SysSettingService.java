package com.bianmaren.service.base;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bianmaren.model.base.SysSetting;

/**
 * @ClassName : SysSettingService
 * @Description : 设置
 * @Author : bianmaren
 * @Date: 2020-08-20 23:46
 * @Blog: http://www.bianmaren.com
 */
public interface SysSettingService extends IService<SysSetting> {

    String getSysSettingByKey(String key);

}
