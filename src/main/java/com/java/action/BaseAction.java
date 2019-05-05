package com.java.action;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class BaseAction {
	//成功，返回数据
	public Map<String,Object> toJsonSuccess(Object obj) {
		Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
		toJsonMap.put("code", "0000");
		toJsonMap.put("msg", "成功");
		toJsonMap.put("data", obj);
		return toJsonMap;
	}
	//失败
	public Map<String,Object> toJsonFailure() {
		Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
		toJsonMap.put("code", "9998");
		toJsonMap.put("msg", "失败");
		return toJsonMap;
	}
	//异常
	public String toJsonError() {
		Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
		toJsonMap.put("code", "9999");
		toJsonMap.put("msg", "异常");
		return JSON.toJSONString(toJsonMap);
	}

}
