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
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.UserObj;
import com.java.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserAction extends BaseAction{
	private static Logger log = LoggerFactory.getLogger(UserAction.class); 
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public Map<String,Object> login(HttpServletRequest request,HttpServletResponse response){
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userName", userName);
		map.put("userPass", userPass);
		List<UserObj> list = userService.getByMap(map);
		if(list.size()>0) {
			request.getSession().setAttribute("user_session", list.get(0));
			return toJsonSuccess(list);
		}else {
			return toJsonFailure();
		}
	}
}
