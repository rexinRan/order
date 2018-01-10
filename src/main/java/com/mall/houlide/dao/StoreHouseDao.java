package com.mall.houlide.dao;

import com.mall.houlide.bean.StoreHouse;
import com.mall.houlide.bean.StoreHouseQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreHouseDao {
    int countByExample(StoreHouseQuery example);

    int deleteByExample(StoreHouseQuery example);

    int deleteByPrimaryKey(Integer storehouseId);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);

    List<StoreHouse> selectByExample(StoreHouseQuery example);

    StoreHouse selectByPrimaryKey(Integer storehouseId);

    int updateByExampleSelective(@Param("record") StoreHouse record, @Param("example") StoreHouseQuery example);

    int updateByExample(@Param("record") StoreHouse record, @Param("example") StoreHouseQuery example);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}