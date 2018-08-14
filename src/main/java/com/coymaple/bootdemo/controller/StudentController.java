package com.coymaple.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coymaple.bootdemo.base.bean.ResponseBean;
import com.coymaple.bootdemo.domain.Student;
import com.coymaple.bootdemo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseBean getStudent(@RequestParam(name="id",required=false) Integer id) {
		ResponseBean respBean = new ResponseBean();
		List<Student> students;
		if(null == id) {
			//students = studentService.findAllStudent();
			students = studentService.findAllStudent(1, 10);
			if(null != students) {
				respBean.setCode(0);
				respBean.setMsg("success");
				respBean.setData(students);
			}else {
				respBean.setCode(-1);
				respBean.setMsg("fail");
			}
		}
		
		return respBean;
	}
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ResponseBean getStudent2(Integer pages,Integer size) {
		ResponseBean respBean = new ResponseBean();
		List<Student> students;
		students = studentService.findAllStudent(1,10);
		if(null != students) {
			respBean.setCode(0);
			respBean.setMsg("success");
			respBean.setData(students);
		}else {
			respBean.setCode(-1);
			respBean.setMsg("fail");
		}
		return respBean;
	}
}
