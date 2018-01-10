package com.mall.houlide.dao;

import com.mall.houlide.bean.Customer;
import com.mall.houlide.bean.CustomerQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {
    int countByExample(CustomerQuery example);

    int deleteByExample(CustomerQuery example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerQuery example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerQuery example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerQuery example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}