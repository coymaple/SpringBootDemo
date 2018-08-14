package com.coymaple.bootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coymaple.bootdemo.domain.Student;
import com.coymaple.bootdemo.domain.StudentExample;
import com.coymaple.bootdemo.mapper.StudentMapper;
import com.coymaple.bootdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeStudent(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> findAllStudent(Integer pages,Integer size) {
		
		StudentExample example = new StudentExample();
		return studentMapper.selectByExample(example);
	}

	@Override
	public Student findOneStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
