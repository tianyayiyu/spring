package com.zlu.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

//@Repository
public class UserDao1 implements Dao, ApplicationContextAware {

	public UserDao1() {
		System.out.println("dao1-init");
	}

	public void query(){
		System.out.println("userdao1");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		applicationContext.getBean("");
	}
}
