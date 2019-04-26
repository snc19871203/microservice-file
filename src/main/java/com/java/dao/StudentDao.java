package com.java.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.java.entity.StudentEntity;
@Mapper
public interface StudentDao {

	List<StudentEntity> getAll();
	
}
