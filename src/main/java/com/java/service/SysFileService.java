package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.entity.SysFileObj;

public interface SysFileService {
	List<SysFileObj> getAll(Map<String,Object> map);
	SysFileObj getById(String id);
	int insert(SysFileObj sysFileObj) throws Exception;
	int update(SysFileObj sysFileObj);
	int delete(String id);
}
