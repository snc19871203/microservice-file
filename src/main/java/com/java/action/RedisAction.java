package com.java.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.UserObj;

@RestController
@RequestMapping(value="/redis")
public class RedisAction extends BaseAction{
	private static Logger log = LoggerFactory.getLogger(RedisAction.class); 
	@Autowired
    private RedisTemplate redisCacheTemplate;
    @RequestMapping("/test")
    public Map<String,Object> setString(String key, String value){
        UserObj userObj = new UserObj();
        userObj.setUserName("redisUser");
        userObj.setUserPass("123");
        userObj.setPhone("13099991111");
        redisCacheTemplate.opsForValue().set("userObj1", userObj);
        UserObj obj = (UserObj) redisCacheTemplate.opsForValue().get("userObj");
        return toJsonSuccess(obj);
    }

}
