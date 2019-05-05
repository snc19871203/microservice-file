package com.java.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.SysFileDao;
import com.java.entity.SysFileObj;
import com.java.service.SysFileService;

@Service
//@CacheConfig(cacheNames="file")
public class SysFileServiceimpl implements SysFileService {
	private static Logger log = LoggerFactory.getLogger(SysFileServiceimpl.class);
	@Autowired
	private SysFileDao sysFileDao;
	
	@Override
	@Cacheable(cacheNames="getfile")
	public List<SysFileObj> getAll(Map<String, Object> map) {
		return sysFileDao.getAll(map);
	}

	@Override
	public SysFileObj getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(SysFileObj sysFileObj) throws Exception  {//业务层异常全部抛出
		int flag = sysFileDao.insert(sysFileObj);
		if(flag == 0) {
			log.info("业务层插入数据失败。");
		}
		log.info("业务层插入数据成功。");
		return flag;
	}

	@Override
	public int update(SysFileObj sysFileObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
