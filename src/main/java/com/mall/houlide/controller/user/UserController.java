package com.mall.houlide.controller.user;

import com.mall.houlide.bean.User;
import com.mall.houlide.service.user.UserService;
import com.mall.houlide.util.UUIDGenerator;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rexin on 2017/12/29.
 */
@Controller
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @RequestMapping(value = "registUser.do", method = {RequestMethod.POST})
    public String toRegistUser(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        /*生成UUID唯一识别码*/
        String ger = UUIDGenerator.generate();
        String userId = ger.substring(0, 8) + ger.substring(9, 15);

        map.put("userId", user.getUserId());
        map.put("username", user.getUserName());
        map.put("userPwd", user.getUserPwd());

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        map.put("createTime", user.getCreateTime());


        return "system/registSucess";
    }


    @RequestMapping(value = "loginUser.do", method = {RequestMethod.POST})
    public String loginUsers(String username, String userPwd, HttpSession session, Model model) throws Exception {
        //1:用户名不能为空
        if (null != username) {
            //2:密码不能为空
            if (null != userPwd) {
                //3:用户名必须正确
                User user = userService.selectByUserName(username);
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
