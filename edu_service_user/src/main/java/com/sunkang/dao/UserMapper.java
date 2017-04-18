package com.sunkang.dao;

import java.util.List;

import com.sunkang.facade.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectUserAll();
    
    List<User> selectUser(User user);
    
    Integer countUser(User user);
}