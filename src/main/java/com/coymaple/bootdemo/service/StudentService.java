package com.coymaple.bootdemo.service;

import java.util.List;

import com.coymaple.bootdemo.domain.Student;

public interface StudentService {
	//增
	public int addStudent(Student student);
	//删
	public int removeStudent(Integer id);
	//改
	public int modifyStudent(Student student);
	//查
	public List<Student> findAllStudent(Integer pages,Integer size);
	public Student findOneStudent(Integer id);
	public List<Student> findStudentByName(String name);
}
