package com.wangqing.service.imp;

import com.wangqing.bean.Student;
import com.wangqing.dao.StudentMapper;
import com.wangqing.service.StudentService;

public class StudentServiceImp implements StudentService {
	private StudentMapper studentMapper;
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public Student queryStudentBystuNo(int stuNo) {
		// TODO Auto-generated method stub
		
		return studentMapper.queryStudentBystuNo(stuNo);
	}
	

}
