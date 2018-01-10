package com.mall.houlide.dao;

import com.mall.houlide.bean.ProductSupplier;
import com.mall.houlide.bean.ProductSupplierQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductSupplierDao {
    int countByExample(ProductSupplierQuery example);

    int deleteByExample(ProductSupplierQuery example);

    int insert(ProductSupplier record);

    int insertSelective(ProductSupplier record);

    List<ProductSupplier> selectByExample(ProductSupplierQuery example);

    int updateByExampleSelective(@Param("record") ProductSupplier record, @Param("example") ProductSupplierQuery example);

    int updateByExample(@Param("record") ProductSupplier record, @Param("example") ProductSupplierQuery example);
}