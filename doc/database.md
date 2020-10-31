# 数据库设计

### 系统设置表
| 字段名 | 字段类型 | 必填 | 说明 |
| :-----| ----: | :----: | :----: |
| 单元格 | 单元格 | 单元格 | 单元格 |
| 单元格 | 单元格 | 单元格 | 单元格 |


### 用户表 t_sys_user
| 字段名 | 字段类型 | 必填 | 说明 |
| :-----| ----: | :----: | :----: |
| id    | String | 是    | 主键    |
| username | String | 是 | 登录账号    |
| realname    | String | 否    | 真实姓名    |
| password    | String | 否   | md5密码盐    |
| birthday    | DateTime | 否    | 生日    |
| avatar    | String | 否    | 头像    |
| sex    | int | 否    | 性别    |
| email    | String | 否    | 电子邮件    |
| phone    | String | 否    | 电话    |
| status    | int | 否    | 状态(1：正常  2：冻结 ）   |
| delFlag    | int | 否    | 删除状态（0，正常，1已删除）   |



