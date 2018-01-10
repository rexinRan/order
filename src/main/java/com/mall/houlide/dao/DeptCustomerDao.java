package com.mall.houlide.dao;

import com.mall.houlide.bean.DeptCustomer;
import com.mall.houlide.bean.DeptCustomerQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptCustomerDao {
    int countByExample(DeptCustomerQuery example);

    int deleteByExample(DeptCustomerQuery example);

    int insert(DeptCustomer record);

    int insertSelective(DeptCustomer record);

    List<DeptCustomer> selectByExample(DeptCustomerQuery example);

    int updateByExampleSelective(@Param("record") DeptCustomer record, @Param("example") DeptCustomerQuery example);

    int updateByExample(@Param("record") DeptCustomer record, @Param("example") DeptCustomerQuery example);
}