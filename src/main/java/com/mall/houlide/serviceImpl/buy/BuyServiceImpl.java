package com.mall.houlide.serviceImpl.buy;

import com.mall.houlide.bean.Buy;
import com.mall.houlide.bean.BuyQuery;
import com.mall.houlide.dao.BuyDao;
import com.mall.houlide.service.buy.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rexin on 2018/2/23.
 */
@Service
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyDao buyDao;

    @Override
    public int countByExample(BuyQuery example) {
        return 0;
    }

    @Override
    public int deleteByExample(BuyQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer buyId) {
        return 0;
    }

    @Override
    public int insert(Buy record) {
        return 0;
    }

    @Override
    public int insertSelective(Buy record) {
        return 0;
    }

    @Override
    public List<Buy> selectByExample(BuyQuery example) {
        return null;
    }

    @Override
    public Buy selectByPrimaryKey(Integer buyId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Buy record, BuyQuery example) {
        return 0;
    }

    @Override
    public int updateByExample(Buy record, BuyQuery example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Buy record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Buy record) {
        return 0;
    }
}
