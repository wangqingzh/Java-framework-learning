package com.wangqing.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangqing.bean.Student;
import com.wangqing.dao.StudentMapper;
@Service("studentService")
@Transactional
public class StudentService {
	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	public Student selectStudent(int stuNo) {
		return studentMapper.selectStudent(stuNo);
	}
	
	public void insertStudent(Student student) {
		studentMapper.insertStudent(student);
		int i = 1/0;
	}
}
