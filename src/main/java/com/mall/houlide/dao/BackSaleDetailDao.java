package com.mall.houlide.dao;

import com.mall.houlide.bean.BackSaleDetail;
import com.mall.houlide.bean.BackSaleDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackSaleDetailDao {
    int countByExample(BackSaleDetailQuery example);

    int deleteByExample(BackSaleDetailQuery example);

    int insert(BackSaleDetail record);

    int insertSelective(BackSaleDetail record);

    List<BackSaleDetail> selectByExample(BackSaleDetailQuery example);

    int updateByExampleSelective(@Param("record") BackSaleDetail record, @Param("example") BackSaleDetailQuery example);

    int updateByExample(@Param("record") BackSaleDetail record, @Param("example") BackSaleDetailQuery example);
}