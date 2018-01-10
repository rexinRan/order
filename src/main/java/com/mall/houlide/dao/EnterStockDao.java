package com.mall.houlide.dao;

import com.mall.houlide.bean.EnterStock;
import com.mall.houlide.bean.EnterStockQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterStockDao {
    int countByExample(EnterStockQuery example);

    int deleteByExample(EnterStockQuery example);

    int deleteByPrimaryKey(Integer enterstockId);

    int insert(EnterStock record);

    int insertSelective(EnterStock record);

    List<EnterStock> selectByExample(EnterStockQuery example);

    EnterStock selectByPrimaryKey(Integer enterstockId);

    int updateByExampleSelective(@Param("record") EnterStock record, @Param("example") EnterStockQuery example);

    int updateByExample(@Param("record") EnterStock record, @Param("example") EnterStockQuery example);

    int updateByPrimaryKeySelective(EnterStock record);

    int updateByPrimaryKey(EnterStock record);
}