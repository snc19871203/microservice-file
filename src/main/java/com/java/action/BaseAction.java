package com.java.action;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class BaseAction {
	Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
	//成功，返回数据
	public String toJsonSuccess(Object obj) {
		toJsonMap.put("code", "0000");
		toJsonMap.put("msg", "成功");
		toJsonMap.put("data", obj);
		return JSON.toJSONString(toJsonMap);
	}
	//失败
	public String toJsonFailure() {
		toJsonMap.put("code", "9998");
		toJsonMap.put("msg", "失败");
		return JSON.toJSONString(toJsonMap);
	}
	//异常
	public String toJsonError() {
		toJsonMap.put("code", "9999");
		toJsonMap.put("msg", "异常");
		return JSON.toJSONString(toJsonMap);
	}

}
