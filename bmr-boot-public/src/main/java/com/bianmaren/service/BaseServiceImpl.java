package com.bianmaren.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bianmaren.model.BaseModel;


/**
 * @ClassName : SysSettingServiceImpl
 * @Description : BaseService
 * @Author : bianmaren
 * @Date: 2020-08-20 23:47
 * @Blog: http://www.bianmaren.com
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseModel> extends ServiceImpl<M, T> {


}
