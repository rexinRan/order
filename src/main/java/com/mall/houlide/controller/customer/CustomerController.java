package com.mall.houlide.controller.customer;

import com.mall.houlide.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by rexin on 2017/12/29.
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;


}
