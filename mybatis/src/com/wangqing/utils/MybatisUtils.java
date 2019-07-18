package com.wangqing.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory ssF = null;
	static {
		try {
			//使用MyBatis提供的Resource类加载MyBatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			//构建SqlSessionFactory工厂
			ssF = new SqlSessionFactoryBuilder().build(reader); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static SqlSession getSession() {
		return ssF.openSession();
	}
}
