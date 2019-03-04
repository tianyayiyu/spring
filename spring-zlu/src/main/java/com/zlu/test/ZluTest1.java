package com.zlu.test;

import com.zlu.config.AppConfig;
import com.zlu.dao.MyCallBack;
import com.zlu.dao.UserDao;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 *ApplicationContextAwareProcessor
 */
public class ZluTest1 {
	public static void main(String[] args) {


//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		//context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
//		context.register(AppConfig.class);
//		//读取bean
//		//context.register(UserDao.class);
//		//context.scan("");
//		//初始化spring环境，包括bean的实例化，解析
//		context.refresh();
//
//		AppConfig app=context.getBean(AppConfig.class);

		/**
		 * cglib代理
		 */
		Enhancer enhancer = new Enhancer();
		//增强父类 cglib是基于继承的，将appconfig类当成父类
		enhancer.setSuperclass(UserDao.class);

		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		//拦截器 对目标对象的所有方法进行拦截 重要
		enhancer.setCallback(new MyCallBack());
		UserDao dao= (UserDao) enhancer.create();
		dao.query();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
