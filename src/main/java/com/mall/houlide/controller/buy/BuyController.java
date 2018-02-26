package com.mall.houlide.controller.buy;

import com.mall.houlide.bean.Buy;
import com.mall.houlide.bean.BuyOrder;
import com.mall.houlide.service.buy.BuyService;
import com.mall.houlide.service.buyerOrder.BuyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rexin on 2018/2/23.
 */
@Controller
public class BuyController {

    @Autowired
    private BuyOrderService buyOrderService;

    @RequestMapping("to_buy_order.do")
    public  String to_buy_order (Model model){

        List<BuyOrder> buyOrderList = buyOrderService.selectByExample(null);

        model.addAllAttributes(buyOrderList);


        return "buyOrder/list_buy_order";
    }



}
