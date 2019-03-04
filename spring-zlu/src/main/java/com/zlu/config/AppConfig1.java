package com.zlu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zlu")
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@Import(MyImportSelter.class)//import能处理三种类 处理importselter类
//@Import(UserDao.class)//处理普通类
//@Import(ImportBeanDefinitionRegistrar.class）//处理ImportBeanDefinitionRegistrar类
//@ImportResource("spring.xml")
public class AppConfig1 {

	//没有加@Configuration 打印两个dao1-init ，加了，就说明产生了cglib代理，只调用代理方法userDao 所以打印一个ao1-init


//	@Bean //spring解析这个bean的时候是getBean（）
//	public  Dao userDao3(){
//
//		return new UserDao3();
//	}
//
//	@Bean  //spring解析这个bean的时候new 一个
//	public UserDao userDao(){
//		userDao3();
//		return new UserDao();
//	}
}
