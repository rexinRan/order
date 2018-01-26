package com.mall.houlide.dao;

import com.mall.houlide.bean.OrderState;
import com.mall.houlide.bean.OrderStateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStateDao {
    int countByExample(OrderStateQuery example);

    int deleteByExample(OrderStateQuery example);

    int insert(OrderState record);

    int insertSelective(OrderState record);

    List<OrderState> selectByExample(OrderStateQuery example);

    int updateByExampleSelective(@Param("record") OrderState record, @Param("example") OrderStateQuery example);

    int updateByExample(@Param("record") OrderState record, @Param("example") OrderStateQuery example);
}