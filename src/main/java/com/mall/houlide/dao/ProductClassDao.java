package com.mall.houlide.dao;

import com.mall.houlide.bean.ProductClass;
import com.mall.houlide.bean.ProductClassQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductClassDao {
    int countByExample(ProductClassQuery example);

    int deleteByExample(ProductClassQuery example);

    int deleteByPrimaryKey(Integer productclassId);

    int insert(ProductClass record);

    int insertSelective(ProductClass record);

    List<ProductClass> selectByExample(ProductClassQuery example);

    ProductClass selectByPrimaryKey(Integer productclassId);

    int updateByExampleSelective(@Param("record") ProductClass record, @Param("example") ProductClassQuery example);

    int updateByExample(@Param("record") ProductClass record, @Param("example") ProductClassQuery example);

    int updateByPrimaryKeySelective(ProductClass record);

    int updateByPrimaryKey(ProductClass record);
}