package com.wangqing.converter;

import org.springframework.core.convert.converter.Converter;

import com.wangqing.bean.Student;

//实现转换器顶级接口 Converter<S, T> String --> Student
public class MyConverter implements Converter<String, Student>{

	@Override
	public Student convert(String source) {
		// TODO Auto-generated method stub
		String[] studentStrArr = source.split("-");
		Student student = new Student();
		student.setStuId(Integer.parseInt(studentStrArr[0]));
		student.setStuName(studentStrArr[1]);
		
		return student;
	}

}
