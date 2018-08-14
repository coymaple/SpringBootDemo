package com.coymaple.bootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coymaple.bootdemo.domain.Student;
import com.coymaple.bootdemo.domain.StudentExample;
import com.coymaple.bootdemo.domain.StudentExample.Criteria;
import com.coymaple.bootdemo.mapper.StudentMapper;
import com.coymaple.bootdemo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
		return studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int modifyStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student findOneStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Student> findStudentByName(String name,int pageNum,int pageSize) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(name);
		PageHelper.startPage(pageNum, pageSize);
		List<Student> students = studentMapper.selectByExample(example);
		PageInfo<Student> pageinfo = new PageInfo<>(students);
		return pageinfo;
	}

	@Override
	public List<Student> findAllStudent() {
		StudentExample example = new StudentExample();
		return studentMapper.selectByExample(example);
	}

	@Override
	public PageInfo<Student> findStudentHavePage(int pageNum, int pageSize) {
		StudentExample example = new StudentExample();
		PageHelper.startPage(pageNum, pageSize);
		List<Student> students = studentMapper.selectByExample(example);
		PageInfo<Student> pageinfo = new PageInfo<>(students);
		return pageinfo;
	}

}
