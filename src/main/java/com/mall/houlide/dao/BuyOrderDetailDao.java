package com.mall.houlide.dao;

import com.mall.houlide.bean.BuyOrderDetail;
import com.mall.houlide.bean.BuyOrderDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyOrderDetailDao {
    int countByExample(BuyOrderDetailQuery example);

    int deleteByExample(BuyOrderDetailQuery example);

    int insert(BuyOrderDetail record);

    int insertSelective(BuyOrderDetail record);

    List<BuyOrderDetail> selectByExample(BuyOrderDetailQuery example);

    int updateByExampleSelective(@Param("record") BuyOrderDetail record, @Param("example") BuyOrderDetailQuery example);

    int updateByExample(@Param("record") BuyOrderDetail record, @Param("example") BuyOrderDetailQuery example);
}