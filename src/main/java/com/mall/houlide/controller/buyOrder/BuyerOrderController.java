package com.mall.houlide.controller.buyOrder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.houlide.bean.BuyOrder;
import com.mall.houlide.service.buyerOrder.BuyOrderService;
import com.mall.houlide.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by rexin on 2018/2/5.
 */
@Controller
public class BuyerOrderController {

    @Autowired
    private BuyOrderService buyOrderService;

    /**
     * 跳转到采购合同总页面
     *
     * @return
     */
    @RequestMapping(value = "to_buy_order_detail.do")
    public String to_buy_order_detail(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model, HttpSession session) {

        PageHelper.startPage(pn, 5);
        List<BuyOrder> buyOrderList = buyOrderService.selectByExample(null);
        PageInfo page = new PageInfo(buyOrderList, 5);
        model.addAttribute("buyOrderLists", page);
        session.setAttribute("b", buyOrderList);

        LogUtil.info("输出--》" + buyOrderList);
        LogUtil.info("输出--》" + buyOrderList);

        return "orderDetail/buy_order_detail";
    }

}
