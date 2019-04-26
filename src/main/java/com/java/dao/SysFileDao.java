package com.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.java.entity.SysFileObj;

@Mapper
public interface SysFileDao {

	List<SysFileObj> getAll(Map<String,Object> map);
	SysFileObj getById(String id);
	int insert(SysFileObj sysFileObj);
	int update(SysFileObj sysFileObj);
	int delete(String id);
	
}
