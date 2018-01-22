package com.interview.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.interview.dao.IStudentDao;
import com.interview.model.Student;
@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements IStudentDao{

	private static final String NAMESPACE = "com.interview.mapper.studentMapper.";
    
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    
	@Override
	public Student selectStudentById(Integer studentId) {
		return getSqlSession().selectOne(NAMESPACE+"selectStudentById", studentId);
	}

}
