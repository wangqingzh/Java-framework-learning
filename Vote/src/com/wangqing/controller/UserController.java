package com.wangqing.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wangqing.bean.User;
import com.wangqing.service.UserService;
import com.wangqing.service.imp.VoteServiceImp;

@Controller
public class UserController {
	@Resource(name="userServiceImp")
	private UserService userService;
	
	@Resource(name="voteServiceImp")
	private VoteServiceImp voteServiceImp;
	//登录控制 投票页面显示控制
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(String usercode, String userpassword, HttpSession session, Map<String, String> map) {
		User user = userService.findUser(usercode, userpassword);
		if(user != null) {
			session.setAttribute("user_session", user);
			Integer userId = user.getUserId();
			//判断是否投票 
			if(voteServiceImp.selectVoteById(userId) != null) {
				map.put("voteStatus", "1");
			}else {
				map.put("voteStatus", "0");
			}
			return "vote";
		}
		return "redirect:/index.html";
	}
	//退出登录
	@RequestMapping(value="logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/index.html";
	}
	//注册控制
	@RequestMapping("register")
	public String register(User user) {
		userService.insertUser(user);
		return "redirect:/index.html";
	}
}
