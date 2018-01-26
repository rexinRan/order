package com.mall.houlide.controller.system;

import com.mall.houlide.bean.User;
import com.mall.houlide.common.SystemCommon;
import com.mall.houlide.service.user.UserService;
import com.mall.houlide.util.LogUtil;
import com.mall.houlide.util.PasswordUtil;
import com.mall.houlide.util.UUIDGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rexin on 2018/1/5.
 */

@Controller
public class SystemController {

    private static final Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Autowired
    private UserService userService;

    /**
     * 跳转到主页
     * 临时用    登陆的时候可以删除这段
     *
     * @return
     */
    @RequestMapping(value = "login_index.do")
    public String login_index(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd, HttpSession session, Model model) throws Exception {

        /*User user1 = userService.selectByUserIdorUserPwd(user);*/
        User user1 = userService.selectByUserName(userName);
       /* byte[] salt = PasswordUtil.getStaticSalt();
        String ciphertext = PasswordUtil.encrypt(userName, userPwd, salt);

        logger.info("结果"+userPwd.equals(PasswordUtil.decrypt(userName, userPwd, salt)));
        if (null != user1) {
            try {
                if (userPwd.equals(PasswordUtil.decrypt(ciphertext, userPwd, salt))) {

                }

            }catch (Exception e){
                e.printStackTrace();
            }

                session.setAttribute("user", user1);*/

                return "system/system_index";

       /* }
        logger.info("用户名1：" + user1.getUserName() + "，密码1：" + user1.getUserPwd() + "，ID1：" + user1.getUserId());

        return "system/login";*/
    }
    @RequestMapping(value = "login_index1.do")
    public String login_index1(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd, HttpSession session, Model model) throws Exception {

        /*User user1 = userService.selectByUserIdorUserPwd(user);*/
        User user1 = userService.selectByUserName(userName);
        byte[] salt = PasswordUtil.getStaticSalt();
        String ciphertext = PasswordUtil.encrypt(userName, userPwd, salt);

        logger.info("结果"+userPwd.equals(PasswordUtil.decrypt(userName, userPwd, salt)));
        if (null != user1) {
            try {
                if (userPwd.equals(PasswordUtil.decrypt(ciphertext, userPwd, salt))) {

                }

            }catch (Exception e){
                e.printStackTrace();
            }

                session.setAttribute("user", user1);

                return "system/system_index";

        }
        logger.info("用户名1：" + user1.getUserName() + "，密码1：" + user1.getUserPwd() + "，ID1：" + user1.getUserId());

        return "system/login";
    }

    @RequestMapping(value = "registUser.do", method = {RequestMethod.POST})
    public String registUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd, HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        /*生成UUID唯一识别码*/
        String ger = UUIDGenerator.generate();
        String userId = ger.substring(0, 8) + ger.substring(11, 15) + ger.substring(21, 25);

        //加密
        byte[] salt = PasswordUtil.getStaticSalt();
        String ciphertext = PasswordUtil.encrypt(userName, userPwd, salt);
        LogUtil.info("密文是" + ciphertext);

        Date date = new Date();
        String createDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        String createTime = new SimpleDateFormat("HH:mm:ss ").format(date);

        /*map.put("userId", userId);
        map.put("userName", userName);
        map.put("userPwd", userPwd);*/

        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserPwd(ciphertext);
        user.setUserStatus(SystemCommon.STATE_ON);
        user.setUserAuth(SystemCommon.STATE_AUTH);
        user.setCreateDate(createDate);
        user.setCreateTime(createTime);

        userService.insert(user);

        return "system/regist_sucess";
    }


}
