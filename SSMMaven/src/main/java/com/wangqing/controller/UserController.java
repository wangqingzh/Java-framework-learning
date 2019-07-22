package com.wangqing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangqing.service.UserServiceImp;

@Controller
public class UserController {
	@Autowired
	private UserServiceImp userServiceImp;
	
	@RequestMapping("test")
	public String test(Model model) {
		model.addAttribute("list", userServiceImp.show());
		return "index";
	}
}
