package com.mall.houlide.controller.system;

import com.mall.houlide.controller.user.UserController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 销售合同跳转控制
 * Created by rexin on 2018/1/11.
 */
@Controller
public class OrderJumpController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    /**
     * 跳转到销售合同总页面
     *
     * @return
     */
    @RequestMapping(value = "to_file_upload.do")
    public String to_file_upload() {

        return "orderDetail/file_upload";
    }
    /**
     * 跳转到销售合同总页面
     *
     * @return
     */
    @RequestMapping(value = "to_new_order.do")
    public String to_new_order() {

        return "orderDetail/new_order";
    }


    /**
     * 跳转到采购合同总页面
     *
     * @return
     */
    @RequestMapping(value = "to_buy_order_detail.do")
    public String to_buy_order_detail() {

        return "orderDetail/buy_order_detail";
    }

    /**
     * 跳转到质保金页面
     *
     * @return
     */
    @RequestMapping(value = "to_zhi_bao_jin.do")
    public String to_zhi_bao_jin() {

        return "orderDetail/zhi_bao_jin";
    }
}
