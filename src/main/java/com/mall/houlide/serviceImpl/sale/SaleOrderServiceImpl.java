package com.mall.houlide.serviceImpl.sale;

import com.mall.houlide.bean.SaleOrder;
import com.mall.houlide.bean.SaleOrderQuery;
import com.mall.houlide.dao.SaleOrderDao;
import com.mall.houlide.service.sale.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rexin on 2018/1/25.
 */
@Service
public class SaleOrderServiceImpl implements SaleOrderService{

    @Autowired
    private SaleOrderDao saleOrderDao;

    @Override
    public List<SaleOrder> selectAllSaleOrder() {
        return saleOrderDao.selectByExample(null);
    }

    @Override
    public int countByExample(SaleOrderQuery example) {
        return 0;
    }

    @Override
    public int deleteByExample(SaleOrderQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer saleorderId) {
        return 0;
    }

    @Override
    public int insert(SaleOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(SaleOrder record) {
        return 0;
    }

    @Override
    public List<SaleOrder> selectByExample(SaleOrderQuery example) {
        return null;
    }

    @Override
    public SaleOrder selectByPrimaryKey(Integer saleorderId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(SaleOrder record, SaleOrderQuery example) {
        return 0;
    }

    @Override
    public int updateByExample(SaleOrder record, SaleOrderQuery example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SaleOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SaleOrder record) {
        return 0;
    }
}
