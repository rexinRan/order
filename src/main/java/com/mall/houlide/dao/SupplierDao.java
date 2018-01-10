package com.mall.houlide.dao;

import com.mall.houlide.bean.Supplier;
import com.mall.houlide.bean.SupplierQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierDao {
    int countByExample(SupplierQuery example);

    int deleteByExample(SupplierQuery example);

    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierQuery example);

    Supplier selectByPrimaryKey(Integer supplierId);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierQuery example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierQuery example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}