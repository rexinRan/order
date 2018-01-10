package com.mall.houlide.dao;

import com.mall.houlide.bean.BuyOrder;
import com.mall.houlide.bean.BuyOrderQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyOrderDao {
    int countByExample(BuyOrderQuery example);

    int deleteByExample(BuyOrderQuery example);

    int deleteByPrimaryKey(Integer buyorderId);

    int insert(BuyOrder record);

    int insertSelective(BuyOrder record);

    List<BuyOrder> selectByExample(BuyOrderQuery example);

    BuyOrder selectByPrimaryKey(Integer buyorderId);

    int updateByExampleSelective(@Param("record") BuyOrder record, @Param("example") BuyOrderQuery example);

    int updateByExample(@Param("record") BuyOrder record, @Param("example") BuyOrderQuery example);

    int updateByPrimaryKeySelective(BuyOrder record);

    int updateByPrimaryKey(BuyOrder record);
}