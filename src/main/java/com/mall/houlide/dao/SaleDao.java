package com.mall.houlide.dao;

import com.mall.houlide.bean.Sale;
import com.mall.houlide.bean.SaleQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleDao {
    int countByExample(SaleQuery example);

    int deleteByExample(SaleQuery example);

    int deleteByPrimaryKey(Integer saleId);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleQuery example);

    Sale selectByPrimaryKey(Integer saleId);

    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleQuery example);

    int updateByExample(@Param("record") Sale record, @Param("example") SaleQuery example);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}