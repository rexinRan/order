package com.mall.houlide.dao;

import com.mall.houlide.bean.OrderManager;
import com.mall.houlide.bean.OrderManagerQuery;
import com.mall.houlide.bean.OrderManagerWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderManagerDao {
    int countByExample(OrderManagerQuery example);

    int deleteByExample(OrderManagerQuery example);

    int deleteByPrimaryKey(String id);

    int insert(OrderManagerWithBLOBs record);

    int insertSelective(OrderManagerWithBLOBs record);

    List<OrderManagerWithBLOBs> selectByExampleWithBLOBs(OrderManagerQuery example);

    List<OrderManager> selectByExample(OrderManagerQuery example);

    OrderManagerWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderManagerWithBLOBs record, @Param("example") OrderManagerQuery example);

    int updateByExampleWithBLOBs(@Param("record") OrderManagerWithBLOBs record, @Param("example") OrderManagerQuery example);

    int updateByExample(@Param("record") OrderManager record, @Param("example") OrderManagerQuery example);

    int updateByPrimaryKeySelective(OrderManagerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderManagerWithBLOBs record);

    int updateByPrimaryKey(OrderManager record);
}