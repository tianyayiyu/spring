package com.zlu.config;

import com.zlu.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * BeanPostProcessor 是spring的扩展点之一，后置处理器 插手bean的实例化过程
 */
//@Component
public class MyPostProsser implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		if(beanName.equals("userDao"))
		//System.out.println("postProcessBeforeInitialization");
		Object cc = Proxy.newProxyInstance(MyPostProsser.class.getClassLoader(), bean.getClass().getInterfaces(), new MyInvocationHandler(bean));
		return cc;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//if(beanName.equals("userDao"))
	//	System.out.println("postProcessAfterInitialization");
		return bean;
	}
}
