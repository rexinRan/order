package com.mall.houlide.dao;

import com.mall.houlide.bean.LeaveStock;
import com.mall.houlide.bean.LeaveStockQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaveStockDao {
    int countByExample(LeaveStockQuery example);

    int deleteByExample(LeaveStockQuery example);

    int deleteByPrimaryKey(Integer leavestockId);

    int insert(LeaveStock record);

    int insertSelective(LeaveStock record);

    List<LeaveStock> selectByExample(LeaveStockQuery example);

    LeaveStock selectByPrimaryKey(Integer leavestockId);

    int updateByExampleSelective(@Param("record") LeaveStock record, @Param("example") LeaveStockQuery example);

    int updateByExample(@Param("record") LeaveStock record, @Param("example") LeaveStockQuery example);

    int updateByPrimaryKeySelective(LeaveStock record);

    int updateByPrimaryKey(LeaveStock record);
}