package com.mall.houlide.controller.system;

import com.mall.houlide.bean.User;
import com.mall.houlide.service.user.UserService;
import com.mall.houlide.util.LogUtil;
import com.mall.houlide.util.PasswordUtil;
import com.mall.houlide.util.UUIDGenerator;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
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
    /*@RequestMapping(value = "login_index.do")
    public String login_index(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd, HttpSession session) throws Exception {

        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        logger.debug("用户名：" + userName + "，密码：" + userPwd);
        User user1 = (User) userService.selectByUserIdorUserPwd(user);


        if (user.getUserPwd() != user1.getUserPwd() && user.getUserName() != user1.getUserName()) {
            logger.debug("name" + user1.getUserName() + "Pwd" + user1.getUserPwd());

            return "system/login";
        }

        logger.debug("name" + user1.getUserName() + "Pwd" + user1.getUserPwd());
        session.setAttribute("currentUser", user1);

        return "system/system_index";
    }*/
    @RequestMapping(value = "registUser.do", method = {RequestMethod.POST})
    public String registUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPwd") String userPwd, HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        /*生成UUID唯一识别码*/
        String ger = UUIDGenerator.generate();
        String userId = ger.substring(0, 8) + ger.substring(11, 15)+ger.substring(21,25);

        //加密
        byte[] salt = PasswordUtil.getStaticSalt();
        String ciphertext = PasswordUtil.encrypt(userName, userPwd, salt);
        LogUtil.info("密文是" + ciphertext);

        Date date = new Date();
        DateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd ");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss ");

        /*map.put("userId", userId);
        map.put("userName", userName);
        map.put("userPwd", userPwd);*/


        User user = new User();

        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserPwd(ciphertext);
        /*user.setCreateTime();*/

        userService.insert(user);

        return "system/regist_sucess";
    }


    @RequestMapping(value = "login_index.do", method = {RequestMethod.POST})
    public String loginUsers(String userName, String userPwd, HttpSession session, Model model) throws Exception {
        //1:用户名不能为空
        if (null != userName) {
            //2:密码不能为空
            if (null != userPwd) {
                //3:用户名必须正确
                User user = userService.selectByUserName(userName);
                if (null != user) {
                    //4:密码必须正确
                    if (user.getUserPwd().equals(encodePassword(userPwd))) {
                        //5:保存用户名到Session中(Redis中）

                        /*sessionProvider.setAttribuerForUsername(RequestUtils.getCSESSIONID(request, response), buyer.getUsername());*/
                        //6:跳转到之前访问页面
                        return "redirect:" + "system/login";
                    } else {
                        model.addAttribute("error", "密码必须正确");
                    }

                } else {
                    model.addAttribute("error", "用户名必须正确");
                }

            } else {
                model.addAttribute("error", "密码不能为空");
            }

        } else {
            model.addAttribute("error", "用户名不能为空");
        }
        return "login";
    }

    //加密  （密码过于简单）有规则密码
    public String encodePassword(String password) {
        //
        //password = "gxzcwefxcbergfd123456errttyyytytrnfzeczxcvertwqqcxvxb";
        //1:MD5  算法
        String algorithm = "MD5";
        char[] encodeHex = null;
        try {
            //MD5加密
            MessageDigest instance = MessageDigest.getInstance(algorithm);
            //加密后
            byte[] digest = instance.digest(password.getBytes());
            //
            //2:十六进制
            encodeHex = Hex.encodeHex(digest);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new String(encodeHex);
    }




}
