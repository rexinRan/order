package com.mall.houlide.dao;

import com.mall.houlide.bean.SaleDetail;
import com.mall.houlide.bean.SaleDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleDetailDao {
    int countByExample(SaleDetailQuery example);

    int deleteByExample(SaleDetailQuery example);

    int insert(SaleDetail record);

    int insertSelective(SaleDetail record);

    List<SaleDetail> selectByExample(SaleDetailQuery example);

    int updateByExampleSelective(@Param("record") SaleDetail record, @Param("example") SaleDetailQuery example);

    int updateByExample(@Param("record") SaleDetail record, @Param("example") SaleDetailQuery example);
}