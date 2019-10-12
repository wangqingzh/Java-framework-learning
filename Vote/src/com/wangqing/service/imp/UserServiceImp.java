package com.wangqing.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqing.bean.User;
import com.wangqing.dao.UserDao;
import com.wangqing.service.UserService;

@Service("userServiceImp")
@Transactional
public class UserServiceImp implements UserService {
//	@Resource(name="userDaoMapper")
	@Autowired
	private UserDao userDao;
	@Override
	public User findUser(String userCode, String userPassword) {
		// TODO Auto-generated method stub
		return this.userDao.findUser(userCode, userPassword);
	}
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
	}

}
