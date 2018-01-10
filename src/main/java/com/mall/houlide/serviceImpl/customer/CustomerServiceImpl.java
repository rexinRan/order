package com.mall.houlide.serviceImpl.customer;

import com.mall.houlide.bean.Customer;
import com.mall.houlide.dao.CustomerDao;
import com.mall.houlide.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rexin on 2017/12/25.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return customerDao.selectByPrimaryKey(customerId);
    }

    @Override
    public Integer insert(Customer record) {
        return customerDao.insert(record);
    }


}
