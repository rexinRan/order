package com.mall.houlide.dao;

import com.mall.houlide.bean.BuyDetail;
import com.mall.houlide.bean.BuyDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyDetailDao {
    int countByExample(BuyDetailQuery example);

    int deleteByExample(BuyDetailQuery example);

    int insert(BuyDetail record);

    int insertSelective(BuyDetail record);

    List<BuyDetail> selectByExample(BuyDetailQuery example);

    int updateByExampleSelective(@Param("record") BuyDetail record, @Param("example") BuyDetailQuery example);

    int updateByExample(@Param("record") BuyDetail record, @Param("example") BuyDetailQuery example);
}