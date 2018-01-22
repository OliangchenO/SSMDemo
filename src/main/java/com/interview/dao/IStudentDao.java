package com.interview.dao;

import com.interview.model.Student;

public interface IStudentDao {
	Student selectStudentById(Integer studentId);
}
