package com.coymaple.bootdemo.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coymaple.bootdemo.SpringBootDemoApplication;
import com.coymaple.bootdemo.domain.Student;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootDemoApplication.class)
public class StudentServiceImplTest {

	@Autowired
	private StudentService studentService;
	@Test
	public void testAddStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testModifyStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOneStudentById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentByName() {
		String name = "%雷%";
		PageInfo<Student> pageInfo = studentService.findStudentByName(name, 1, 5);
		for(Student student:pageInfo.getList()) {
			System.out.println(student.getName());
		}
	}

	@Test
	public void testFindAllStudent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentHavePage() {
		PageInfo<Student> pageInfo = studentService.findStudentHavePage(1, 5);
		for(Student student:pageInfo.getList()) {
			System.out.println(student.getName());
		}
	}

}
