package com.mall.houlide.dao;

import com.mall.houlide.bean.Buy;
import com.mall.houlide.bean.BuyQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyDao {
    int countByExample(BuyQuery example);

    int deleteByExample(BuyQuery example);

    int deleteByPrimaryKey(Integer buyId);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExample(BuyQuery example);

    Buy selectByPrimaryKey(Integer buyId);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyQuery example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyQuery example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}