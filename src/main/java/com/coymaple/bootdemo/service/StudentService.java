package com.coymaple.bootdemo.service;

import java.util.List;

import com.coymaple.bootdemo.domain.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {
	//增
	public int addStudent(Student student);
	//删
	public int removeStudent(Integer id);
	//改
	public int modifyStudent(Student student);
	//查
	public List<Student> findAllStudent();
	public Student findOneStudentById(Integer id);
	public PageInfo<Student> findStudentByName(String name,int pageNum,int pageSize);
	public PageInfo<Student> findStudentHavePage(int pageNum,int pageSize);
}
