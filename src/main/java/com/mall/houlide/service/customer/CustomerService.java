package com.mall.houlide.service.customer;

import com.mall.houlide.bean.Customer;

/**
 * Created by rexin on 2017/12/25.
 */
public interface CustomerService {

    public Customer selectByPrimaryKey(Integer customerId);

    public Integer insert(Customer record);

}
