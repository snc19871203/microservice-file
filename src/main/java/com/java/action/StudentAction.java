package com.java.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.java.dao.StudentDao;
import com.java.entity.StudentEntity;

@RestController
public class StudentAction {
	
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/student/getAll")
	public String getAll(){
		List<StudentEntity> list = studentDao.getAll();
		String result = JSON.toJSONString(list);
		return result;
	}

}
