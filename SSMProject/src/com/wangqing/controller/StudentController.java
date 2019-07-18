package com.wangqing.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangqing.bean.Student;
import com.wangqing.service.imp.StudentServiceImp;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImp studentServiceImp;
	
	@RequestMapping("testStudent/{stuNo}")
	public String testStudent(@PathVariable("stuNo") int stuNo, Map<String, Student> map) {
		Student student = studentServiceImp.queryStudentBystuNo(stuNo);
		map.put("student", student);
		return "result";
	}
}
