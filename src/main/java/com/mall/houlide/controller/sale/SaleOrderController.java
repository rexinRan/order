package com.mall.houlide.controller.sale;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.houlide.bean.SaleOrder;
import com.mall.houlide.service.sale.SaleOrderService;
import com.mall.houlide.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by rexin on 2018/1/24.
 */
@Controller
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    /**
     * 跳转到销售合同总页面
     *
     * @return
     */
    @RequestMapping(value = "to_sale_order_detail.do")
    public String saleList(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //传入页码，以及设置每页大小
        PageHelper.startPage(pn, 5);
        List<SaleOrder> saleLists = saleOrderService.selectByExampleAll(null);
        LogUtil.info("结果" + saleOrderService.selectByExampleAll(null));
     /*   for (SaleOrder sale : saleLists) {
                LogUtil.info("输出2 -- " + sale);
            };*/
        //使用pageInfo包装
        PageInfo page = new PageInfo(saleLists, 5);
        LogUtil.info("输出的是  --  " + page + "  ");
        model.addAttribute("pageInfo", page);
        return "orderDetail/sale_order_detail";
    }


}
