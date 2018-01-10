package com.mall.houlide.dao;

import com.mall.houlide.bean.Dept;
import com.mall.houlide.bean.DeptQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    int countByExample(DeptQuery example);

    int deleteByExample(DeptQuery example);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptQuery example);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptQuery example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptQuery example);
}