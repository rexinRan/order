package com.mall.houlide.serviceImpl.buyerOrder;

import com.mall.houlide.bean.BuyOrder;
import com.mall.houlide.bean.BuyOrderQuery;
import com.mall.houlide.dao.BuyOrderDao;
import com.mall.houlide.service.buyerOrder.BuyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rexin on 2018/2/5.
 */
@Service
public class BuyOrderServiceImpl implements BuyOrderService{

    @Autowired
    private BuyOrderDao buyOrderDao;

    @Override
    public int countByExample(BuyOrderQuery example) {
        return 0;
    }

    @Override
    public int deleteByExample(BuyOrderQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer buyorderId) {
        return 0;
    }

    @Override
    public int insert(BuyOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(BuyOrder record) {
        return 0;
    }

    @Override
    public List<BuyOrder> selectByExample(BuyOrderQuery example) {
        return buyOrderDao.selectByExample(null);
    }

    @Override
    public BuyOrder selectByPrimaryKey(Integer buyorderId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(BuyOrder record, BuyOrderQuery example) {
        return 0;
    }

    @Override
    public int updateByExample(BuyOrder record, BuyOrderQuery example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(BuyOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BuyOrder record) {
        return 0;
    }
}
