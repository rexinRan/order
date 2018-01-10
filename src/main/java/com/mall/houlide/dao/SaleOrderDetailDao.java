package com.mall.houlide.dao;

import com.mall.houlide.bean.SaleOrderDetail;
import com.mall.houlide.bean.SaleOrderDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrderDetailDao {
    int countByExample(SaleOrderDetailQuery example);

    int deleteByExample(SaleOrderDetailQuery example);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    List<SaleOrderDetail> selectByExample(SaleOrderDetailQuery example);

    int updateByExampleSelective(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailQuery example);

    int updateByExample(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailQuery example);
}