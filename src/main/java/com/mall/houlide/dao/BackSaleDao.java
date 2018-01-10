package com.mall.houlide.dao;

import com.mall.houlide.bean.BackSale;
import com.mall.houlide.bean.BackSaleQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackSaleDao {
    int countByExample(BackSaleQuery example);

    int deleteByExample(BackSaleQuery example);

    int deleteByPrimaryKey(Integer backsaleId);

    int insert(BackSale record);

    int insertSelective(BackSale record);

    List<BackSale> selectByExample(BackSaleQuery example);

    BackSale selectByPrimaryKey(Integer backsaleId);

    int updateByExampleSelective(@Param("record") BackSale record, @Param("example") BackSaleQuery example);

    int updateByExample(@Param("record") BackSale record, @Param("example") BackSaleQuery example);

    int updateByPrimaryKeySelective(BackSale record);

    int updateByPrimaryKey(BackSale record);
}