package com.wangqing.dao;

import java.util.List;

import com.wangqing.beans.Grade;
import com.wangqing.beans.Student;

public interface RelationalMapper {
	List<Student> selectStudent(int grade);
	Grade selectGradeWithStudents(int grade);
	Grade selectGradeLazyLoading(int grade);
}
