package com.mall.houlide.dao;

import com.mall.houlide.bean.ProductSpec;
import com.mall.houlide.bean.ProductSpecQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductSpecDao {
    int countByExample(ProductSpecQuery example);

    int deleteByExample(ProductSpecQuery example);

    int deleteByPrimaryKey(Integer productspecId);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);

    List<ProductSpec> selectByExample(ProductSpecQuery example);

    ProductSpec selectByPrimaryKey(Integer productspecId);

    int updateByExampleSelective(@Param("record") ProductSpec record, @Param("example") ProductSpecQuery example);

    int updateByExample(@Param("record") ProductSpec record, @Param("example") ProductSpecQuery example);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
}