package com.coymaple.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coymaple.bootdemo.base.bean.ResponseBean;
import com.coymaple.bootdemo.domain.Student;
import com.coymaple.bootdemo.service.StudentService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ResponseBean getStudent2(
			@RequestParam(name="name",required=false,defaultValue="")String name,
			@RequestParam(name="pageNum",required=false,defaultValue="1")int pageNum,
			@RequestParam(name="pageSize",required=false,defaultValue="10")int pageSize) {
		PageInfo<Student> pageInfo;
		pageInfo = studentService.findStudentByName("%"+name+"%", pageNum, pageSize);
		ResponseBean respBean = new ResponseBean();
		if(null != pageInfo) {
			respBean.setCode(0);
			respBean.setMsg("success");
			respBean.setData(pageInfo);
		}else {
			respBean.setCode(-1);
			respBean.setMsg("fail");
		}
		return respBean;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseBean removeStudent(@PathVariable int id) {
		ResponseBean respBean = new ResponseBean();
		int rowNum = studentService.removeStudent(id);
		if(rowNum == 1) {
			respBean.setCode(0);
			respBean.setMsg("success");
		}else {
			respBean.setCode(-1);
			respBean.setMsg("fail");
		}
		return respBean;
	}
	
	//@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseBean removeStudent2(@PathVariable int...ids) {
		ResponseBean respBean = new ResponseBean();
		for(Integer id: ids) {
			studentService.removeStudent(id);
		}
		return respBean;
	}
	

}
