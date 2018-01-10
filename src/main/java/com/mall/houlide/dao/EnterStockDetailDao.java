package com.mall.houlide.dao;

import com.mall.houlide.bean.EnterStockDetail;
import com.mall.houlide.bean.EnterStockDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterStockDetailDao {
    int countByExample(EnterStockDetailQuery example);

    int deleteByExample(EnterStockDetailQuery example);

    int insert(EnterStockDetail record);

    int insertSelective(EnterStockDetail record);

    List<EnterStockDetail> selectByExample(EnterStockDetailQuery example);

    int updateByExampleSelective(@Param("record") EnterStockDetail record, @Param("example") EnterStockDetailQuery example);

    int updateByExample(@Param("record") EnterStockDetail record, @Param("example") EnterStockDetailQuery example);
}