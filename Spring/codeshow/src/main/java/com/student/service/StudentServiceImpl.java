package com.student.service;

import java.util.Collection;
import java.util.stream.Collectors;

import com.student.core.Student;
import com.student.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	private int numberOfStudents;

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student get(long id) {
		return studentDao.getOne(id);
	}

	@Override
	public Collection<Student> getAllStudents() {
		return studentDao.getAll();
	}

	@Override
	public Collection<Student> getFirstNStudents() {
		return getAllStudents().stream().limit(numberOfStudents).collect(Collectors.toList());
	}

}
