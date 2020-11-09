package com.bianmaren.controller.api.base;

import com.bianmaren.common.Message;
import com.bianmaren.service.base.SysSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bianmaren
 * @Description:
 * @mail 441889070@qq.com
 * @date 2020/8/25
 */
@RestController
@RequestMapping("/api/sms")
public class SmsApiController {

    @Autowired
    private SysSettingService sysSettingService;

    /**
     * 发送验证码
     * @param mobile
     * @return
     */
    @PostMapping("/send")
    public Message sendCode(String mobile){
        Message res = new Message();



        return res;
    }


}
