package com.mall.houlide.dao;

import com.mall.houlide.bean.StockPile;
import com.mall.houlide.bean.StockPileQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockPileDao {
    int countByExample(StockPileQuery example);

    int deleteByExample(StockPileQuery example);

    int deleteByPrimaryKey(Integer stockpileId);

    int insert(StockPile record);

    int insertSelective(StockPile record);

    List<StockPile> selectByExample(StockPileQuery example);

    StockPile selectByPrimaryKey(Integer stockpileId);

    int updateByExampleSelective(@Param("record") StockPile record, @Param("example") StockPileQuery example);

    int updateByExample(@Param("record") StockPile record, @Param("example") StockPileQuery example);

    int updateByPrimaryKeySelective(StockPile record);

    int updateByPrimaryKey(StockPile record);
}