package com.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.java.entity.UserObj;

@Mapper
public interface UserDao {

	List<UserObj> getByMap(Map<String,Object> map);
	
}
