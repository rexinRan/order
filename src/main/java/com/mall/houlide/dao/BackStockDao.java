package com.mall.houlide.dao;

import com.mall.houlide.bean.BackStock;
import com.mall.houlide.bean.BackStockQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackStockDao {
    int countByExample(BackStockQuery example);

    int deleteByExample(BackStockQuery example);

    int deleteByPrimaryKey(Integer backstockId);

    int insert(BackStock record);

    int insertSelective(BackStock record);

    List<BackStock> selectByExample(BackStockQuery example);

    BackStock selectByPrimaryKey(Integer backstockId);

    int updateByExampleSelective(@Param("record") BackStock record, @Param("example") BackStockQuery example);

    int updateByExample(@Param("record") BackStock record, @Param("example") BackStockQuery example);

    int updateByPrimaryKeySelective(BackStock record);

    int updateByPrimaryKey(BackStock record);
}