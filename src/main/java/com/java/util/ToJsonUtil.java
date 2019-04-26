package com.java.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class ToJsonUtil {
	
	Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
	//成功，返回数据
	public String toJsonSuccess(Object obj) {
		toJsonMap.put("code", "0000");
		toJsonMap.put("data", obj);
		return JSON.toJSONString(toJsonMap);
	}
	//失败，返回数据
	public String toJsonFailure(Object obj) {
		toJsonMap.put("code", "9998");
		toJsonMap.put("data", obj);
		return JSON.toJSONString(toJsonMap);
	}
	//异常，返回数据
	public String toJsonError(Object obj) {
		toJsonMap.put("code", "9999");
		toJsonMap.put("data", obj);
		return JSON.toJSONString(toJsonMap);
	}

}
