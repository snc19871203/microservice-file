package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.entity.UserObj;

public interface UserService {
	List<UserObj> getByMap(Map<String,Object> map);
}
