package com.sunkang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunkang.dao.UserMapper;
import com.sunkang.facade.entity.User;
import com.sunkang.facade.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findUserAll(){
		return userMapper.selectUserAll();
	}
	
	public List<User> selectUser(User user){
		return userMapper.selectUser(user);
	}
	
	public Integer countUser(User user){
		return userMapper.countUser(user);
	}
	
	public User selectUserById(String id){
		return userMapper.selectById(id);
	}
}
