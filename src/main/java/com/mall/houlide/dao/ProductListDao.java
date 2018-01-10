package com.mall.houlide.dao;

import com.mall.houlide.bean.ProductList;
import com.mall.houlide.bean.ProductListQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductListDao {
    int countByExample(ProductListQuery example);

    int deleteByExample(ProductListQuery example);

    int deleteByPrimaryKey(Integer productlistId);

    int insert(ProductList record);

    int insertSelective(ProductList record);

    List<ProductList> selectByExample(ProductListQuery example);

    ProductList selectByPrimaryKey(Integer productlistId);

    int updateByExampleSelective(@Param("record") ProductList record, @Param("example") ProductListQuery example);

    int updateByExample(@Param("record") ProductList record, @Param("example") ProductListQuery example);

    int updateByPrimaryKeySelective(ProductList record);

    int updateByPrimaryKey(ProductList record);
}