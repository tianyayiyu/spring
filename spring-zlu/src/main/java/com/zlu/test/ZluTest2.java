package com.zlu.test;

import com.zlu.config.AppConfig;
import com.zlu.config.AppConfig1;
import com.zlu.config.MyBeanFactoryProcessor;
import com.zlu.dao.Dao;
import com.zlu.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *ApplicationContextAwareProcessor
 */
public class ZluTest2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//		context.registerBean(UserDao.class);
//		context.refresh();
//		Dao bean = (Dao) context.getBean("userDao");
//		bean.query();
		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		context.register(AppConfig.class);
		context.refresh();
		System.out.println(context.getBean(AppConfig.class).getClass().getSimpleName());

	}
}
