package com.wangqing.dao;

import org.apache.ibatis.annotations.Param;

import com.wangqing.bean.User;

public interface UserDao {
	public User findUser(@Param("usercode") String userCode, @Param("password") String userPassword);
	public void insertUser(User user);
}
