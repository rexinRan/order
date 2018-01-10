package com.mall.houlide.dao;

import com.mall.houlide.bean.SaleOrder;
import com.mall.houlide.bean.SaleOrderQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderDao {
    int countByExample(SaleOrderQuery example);

    int deleteByExample(SaleOrderQuery example);

    int deleteByPrimaryKey(Integer saleorderId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderQuery example);

    SaleOrder selectByPrimaryKey(Integer saleorderId);

    int updateByExampleSelective(@Param("record") SaleOrder record, @Param("example") SaleOrderQuery example);

    int updateByExample(@Param("record") SaleOrder record, @Param("example") SaleOrderQuery example);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}