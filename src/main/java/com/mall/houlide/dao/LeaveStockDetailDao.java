package com.mall.houlide.dao;

import com.mall.houlide.bean.LeaveStockDetail;
import com.mall.houlide.bean.LeaveStockDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaveStockDetailDao {
    int countByExample(LeaveStockDetailQuery example);

    int deleteByExample(LeaveStockDetailQuery example);

    int insert(LeaveStockDetail record);

    int insertSelective(LeaveStockDetail record);

    List<LeaveStockDetail> selectByExample(LeaveStockDetailQuery example);

    int updateByExampleSelective(@Param("record") LeaveStockDetail record, @Param("example") LeaveStockDetailQuery example);

    int updateByExample(@Param("record") LeaveStockDetail record, @Param("example") LeaveStockDetailQuery example);
}