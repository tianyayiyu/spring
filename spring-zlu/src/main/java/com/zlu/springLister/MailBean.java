package com.zlu.springLister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MailBean {

	@Autowired
	ApplicationContext applicationContext;

	public void sendMail(){
		//触发邮件时间
		applicationContext.publishEvent(new SpringEvent(applicationContext));
	}
}
