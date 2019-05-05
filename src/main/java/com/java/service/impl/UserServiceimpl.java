package com.java.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.UserDao;
import com.java.entity.UserObj;
import com.java.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	private static Logger log = LoggerFactory.getLogger(UserServiceimpl.class);
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<UserObj> getByMap(Map<String, Object> map) {
		return userDao.getByMap(map);
	}

}
