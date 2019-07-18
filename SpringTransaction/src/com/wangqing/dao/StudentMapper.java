package com.wangqing.dao;

import com.wangqing.bean.Student;

public interface StudentMapper {
	Student selectStudent(int stuNo);
	void insertStudent(Student student);
}
