package com.interview.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.interview.model.Student;
import com.interview.service.StudentService;  

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class StudentServiceImplTest {
	private static Logger logger = Logger.getLogger(StudentServiceImplTest.class);  
	@Resource(name = "studentServiceImpl")
	private StudentService studentService;
	
	@Test
	public void testSelectById() {
		Student student = studentService.selectById(1);
		logger.info(student.toString());
		System.out.println(student);
	}

}
