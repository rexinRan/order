package com.mall.houlide.dao;

import com.mall.houlide.bean.ProductUnit;
import com.mall.houlide.bean.ProductUnitQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductUnitDao {
    int countByExample(ProductUnitQuery example);

    int deleteByExample(ProductUnitQuery example);

    int deleteByPrimaryKey(Integer productunitId);

    int insert(ProductUnit record);

    int insertSelective(ProductUnit record);

    List<ProductUnit> selectByExample(ProductUnitQuery example);

    ProductUnit selectByPrimaryKey(Integer productunitId);

    int updateByExampleSelective(@Param("record") ProductUnit record, @Param("example") ProductUnitQuery example);

    int updateByExample(@Param("record") ProductUnit record, @Param("example") ProductUnitQuery example);

    int updateByPrimaryKeySelective(ProductUnit record);

    int updateByPrimaryKey(ProductUnit record);
}