package com.java.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.SysFileObj;
import com.java.service.SysFileService;

@RestController
@RequestMapping(value="/sysfile")
public class SysFileAction extends BaseAction{
	private static Logger log = LoggerFactory.getLogger(SysFileAction.class); 
	@Autowired
	private SysFileService sysFileService;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public String getAll(HttpServletRequest request,HttpServletResponse response){
		String uploadUserId = request.getParameter("uploadUserId");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("uploadUserId", uploadUserId);
		List<SysFileObj> list = sysFileService.getAll(map);
		return toJsonSuccess(list);
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(HttpServletRequest request,HttpServletResponse response,
			SysFileObj sysFileObj) {
		log.info("插入数据开始");
		int flag = 0;
		try {
			flag = sysFileService.insert(sysFileObj);
			if(flag == 0) {
				return toJsonFailure();
			}
		} catch (Exception e) {
			log.error("msg"+e);
			return toJsonError();
		}
		log.info("插入数据结束");
		return toJsonSuccess(flag);
	}

}
