package com.wangqing.dao;

import java.util.List;

import com.wangqing.beans.Grade;
import com.wangqing.beans.Student;

public interface StudentMapper {
	
	List<Student> selectStudentBynameage(Student stu);
	void updateStu(Student stu);
	List<Student> selectStudentByGrade(Grade grades);
}
