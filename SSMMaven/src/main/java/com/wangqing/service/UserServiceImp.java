package com.wangqing.service;

import java.util.List;

import com.wangqing.bean.User;
import com.wangqing.dao.UserMapper;

public class UserServiceImp implements UserService{
	
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> show() {
		// TODO Auto-generated method stub
		return userMapper.queryUser();
	}

}
