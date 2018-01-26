package com.mall.houlide.service.sale;

import com.mall.houlide.bean.SaleOrder;
import com.mall.houlide.bean.SaleOrderQuery;
import com.mall.houlide.bean.SaleQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by rexin on 2018/1/24.
 */
public interface SaleOrderService {

    //查询所有销售合同的数量
    List<SaleOrder> selectAllSaleOrder();

    int countByExample(SaleOrderQuery example);

    int deleteByExample(SaleOrderQuery example);

    int deleteByPrimaryKey(Integer saleorderId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderQuery example);

    SaleOrder selectByPrimaryKey(Integer saleorderId);

    int updateByExampleSelective(@Param("record") SaleOrder record, @Param("example") SaleOrderQuery example);

    int updateByExample(@Param("record") SaleOrder record, @Param("example") SaleOrderQuery example);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);

}
