package com.interview.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.interview.dao.IStudentDao;
import com.interview.model.Student;
import com.interview.service.StudentService;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
	@Resource(name = "studentDaoImpl")
	private IStudentDao studentDao;

	@Override
	public Student selectById(int id) {
		// TODO Auto-generated method stub
		return studentDao.selectStudentById(id);
	}

}
