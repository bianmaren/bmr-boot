package com.bianmaren.service.base.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bianmaren.dao.base.SysSettingDao;
import com.bianmaren.model.base.SysSetting;
import com.bianmaren.service.BaseServiceImpl;
import com.bianmaren.service.base.SysSettingService;
import org.springframework.stereotype.Service;

/**
 * @ClassName : SysSettingServiceImpl
 * @Description : 设置
 * @Author : bianmaren
 * @Date: 2020-08-20 23:47
 * @Blog: http://www.bianmaren.com
 */
@Service("sysSettingServiceImpl")
public class SysSettingServiceImpl extends BaseServiceImpl<SysSettingDao, SysSetting> implements SysSettingService {

    /**
     * 获取设置值
     * @param key
     * @return
     */
    @Override
    public String getSysSettingByKey(String key){
        LambdaQueryWrapper<SysSetting> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysSetting::getSettingName,key);
        SysSetting sysSetting = getOne(queryWrapper);
        if(null != sysSetting){
            return sysSetting.getSettingValue();
        }
        return null;
    }

}
