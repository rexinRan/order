package com.mall.houlide.dao;

import com.mall.houlide.bean.BackStockDetail;
import com.mall.houlide.bean.BackStockDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackStockDetailDao {
    int countByExample(BackStockDetailQuery example);

    int deleteByExample(BackStockDetailQuery example);

    int insert(BackStockDetail record);

    int insertSelective(BackStockDetail record);

    List<BackStockDetail> selectByExample(BackStockDetailQuery example);

    int updateByExampleSelective(@Param("record") BackStockDetail record, @Param("example") BackStockDetailQuery example);

    int updateByExample(@Param("record") BackStockDetail record, @Param("example") BackStockDetailQuery example);
}