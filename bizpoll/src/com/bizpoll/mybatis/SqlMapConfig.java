package com.bizpoll.mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/bizpoll/mybatis/configuration.xml";
		
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			
			if (SqlSessionFactory  == null) {
				SqlSessionFactory  = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (Exception e) {
			e.
		}
		
		public static SqlSessionFactory getSession() {
			return SqlSessionFactory;
		}
	}
}
