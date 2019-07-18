package com.wangqing.service.imp;

import com.wangqing.bean.Student;
import com.wangqing.dao.StudentMapper;
import com.wangqing.service.IStudentService;

public class IStudentServiceImp implements IStudentService {
	private StudentMapper studentMapper;
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentMapper.insetStudent(student);
	}
	
}
