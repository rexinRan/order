package com.mall.houlide.serviceImpl.user;

import com.mall.houlide.bean.User;
import com.mall.houlide.bean.UserQuery;
import com.mall.houlide.dao.UserDao;
import com.mall.houlide.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rexin on 2017/12/29.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User selectByUserName(String username) {
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andUserNameEqualTo(username);
        List<User> users = userDao.selectByExample(userQuery);

        if (null != users && users.size() > 0) {
            return users.get(0);
        }
        return userDao.selectByUserName(username);
    }


    @Override
    public User selectByUserId(String userId) {
        userDao.selectByUserId(userId);
        return userDao.selectByUserId(userId);
    }

    @Override
    public List<User> selectByUserIdz(User record) {
        return null;
    }

    @Override
    public int countByExample(UserQuery example) {
        return userDao.countByExample(example);
    }

    @Override
    public int deleteByExample(UserQuery example) {
        return userDao.deleteByExample(example);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserQuery example) {
        return userDao.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(User record, UserQuery example) {
        return userDao.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(User record, UserQuery example) {
        return userDao.updateByExample(record, example);
    }

    @Override
    public User selectByUserIdorUserPwd(User user) {
        return userDao.selectByUserIdorUserPwd(user);
    }
}
