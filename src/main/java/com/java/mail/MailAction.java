package com.java.mail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.java.action.BaseAction;

@RestController
@RequestMapping(value="email")
public class MailAction extends BaseAction{

	@Autowired 
	private MailUtil mailUtil;
    // 注入模板引擎
    @Autowired 
    private TemplateEngine templateEngine;
    
    @RequestMapping(value="/send",method=RequestMethod.GET)
	public Map<String,Object> getAll(HttpServletRequest request,HttpServletResponse response){
		String email = request.getParameter("email");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("email", email);
		MailBean mailBean = MailBean.getMailBean();
		Context context = new Context();
        context.setVariable("user", "Tyrone");//模板中通过user属性获取value值"Tyrone"
        String content = templateEngine.process("emailTemplates", context);
        mailBean.setSubject("SpringBoot集成JavaMail实现邮件发送");
        mailBean.setText(content);
        mailUtil.sendMailTemplate(mailBean);
        //mailUtil.sendMail();
        Map<String,Object> toJsonMap = new HashMap<String,Object>(); 
		toJsonMap.put("code", "0000");
		toJsonMap.put("msg", "邮件已发送！");
		return toJsonMap;
	}
	
}
