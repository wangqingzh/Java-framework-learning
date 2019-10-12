package com.wangqing.service;

import com.wangqing.bean.User;

public interface UserService {
	public User findUser(String userCode, String userPassword);
	public void insertUser(User user);
	
}
