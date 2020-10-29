package com.bianmaren.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author bianmaren
 * @version 1.0.0
 * @email 441889070@qq.com
 * @Description 实体类带排序基类
 * @createTime 2019年11月15日 14:52:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderModel extends BaseModel {

    /**
     * 排序
     */
    private Integer orders = 0;

}
