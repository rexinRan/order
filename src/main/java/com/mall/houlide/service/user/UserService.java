package com.mall.houlide.service.user;

import com.mall.houlide.bean.User;
import com.mall.houlide.bean.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by rexin on 2017/12/29.
 */
public interface UserService {

    User selectByUserName(String username);

    List<User> selectByUserId(User record);

    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);


}
