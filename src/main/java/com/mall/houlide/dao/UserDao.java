package com.mall.houlide.dao;

import com.mall.houlide.bean.User;
import com.mall.houlide.bean.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<User> selectUserList();

    User selectByUserId(String userId);

    User selectByUserName(@Param("username") String username);

    List<User> selectByUserIdz(User record);

    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);

    User selectByUserIdorUserPwd(User user) throws Exception;

}