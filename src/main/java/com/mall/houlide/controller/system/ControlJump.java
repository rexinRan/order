package com.mall.houlide.controller.system;

import com.mall.houlide.controller.user.UserController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主要控制页面的跳转
 * Created by rexin on 2018/1/9.
 */
@Controller
public class ControlJump {

    private static final Logger logger = Logger.getLogger(UserController.class);

    /**
     * 主页调到登陆页面
     *
     * @return
     */
    @RequestMapping(value = "indexToLogin.do")
    public String indexToLogin() {
        return "system/login";
    }

    /**
     * 注册跳转到登录页面
     *
     * @return
     */
    @RequestMapping(value = "registToLogin.do")
    public String registToLogin() {
        return "system/login";
    }

    /**
     * 注册跳转到注册页面
     *
     * @return
     */
    @RequestMapping(value = "to_regist.do")
    public String toRegist() {
        return "system/regist";
    }

    /**
     * 跳转到忘记密码页面
     *
     * @return
     */
    @RequestMapping(value = "to_forget_password.do")
    public String toForgetPassword() {
        return "system/forgetPassword";
    }

    /**
     * 跳转到主页
     * 临时用    登陆的时候可以删除这段
     *
     * @return
     */
    @RequestMapping(value = "toSystemIndex.do")
    public String toSystemIndex() {
        return "system/systemIndex";
    }

    /**
     * 跳转到系统监督页面
     *
     * @return
     */
    @RequestMapping(value = "to_log_surveillance.do")
    public String to_log_surveillance() {

        return "system/log_surveillance";
    }

    /**
     * 跳转到我的资料页面
     *
     * @return
     */
    @RequestMapping(value = "to_extra_profile.do")
    public String to_extra_profile() {

        return "extra/extraProfile";
    }

    /**
     * 跳转到我的日历页面
     *
     * @return
     */
    @RequestMapping(value = "to_extra_calendar.do")
    public String to_extra_calendar() {

        return "extra/extraCalendar";
    }

    /**
     * 跳转到我的收件箱页面
     *
     * @return
     */
    @RequestMapping(value = "to_extra_inbox.do")
    public String to_extra_inbox() {

        return "extra/extraInbox";
    }

    /**
     * 跳转到锁屏页面
     *
     * @return
     */
    @RequestMapping(value = "to_extra_lock.do")
    public String to_extra_lock() {

        return "extra/extraLock";
    }


}
