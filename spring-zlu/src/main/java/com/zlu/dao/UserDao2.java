package com.zlu.dao;

import com.zlu.config.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class UserDao2 implements BeanPostProcessor {
	public void query() {
		System.out.println("query2");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userDao")){
			System.out.println("daili");
			bean=Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{Dao.class}, new MyInvocationHandler(bean));

		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userDao"))
			System.out.println("postProcessAfterInitialization");
		return bean;
	}
}
