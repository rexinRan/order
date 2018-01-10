package com.mall.houlide.dao;

import com.mall.houlide.bean.DeptSupplier;
import com.mall.houlide.bean.DeptSupplierQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptSupplierDao {
    int countByExample(DeptSupplierQuery example);

    int deleteByExample(DeptSupplierQuery example);

    int insert(DeptSupplier record);

    int insertSelective(DeptSupplier record);

    List<DeptSupplier> selectByExample(DeptSupplierQuery example);

    int updateByExampleSelective(@Param("record") DeptSupplier record, @Param("example") DeptSupplierQuery example);

    int updateByExample(@Param("record") DeptSupplier record, @Param("example") DeptSupplierQuery example);
}