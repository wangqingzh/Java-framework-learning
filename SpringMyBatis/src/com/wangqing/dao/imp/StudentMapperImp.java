package com.wangqing.dao.imp;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.wangqing.bean.Student;
import com.wangqing.dao.StudentMapper;

public class StudentMapperImp extends SqlSessionDaoSupport implements StudentMapper{

	@Override
	public void insetStudent(Student student) {
		// TODO Auto-generated method stub
		SqlSession session = super.getSqlSession();
		StudentMapper stuDao = session.getMapper(StudentMapper.class);
		stuDao.insetStudent(student);
	}

}
