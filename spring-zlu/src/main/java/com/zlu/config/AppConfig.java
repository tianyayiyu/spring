package com.zlu.config;

import com.zlu.dao.Dao;
import com.zlu.dao.UserDao;
import com.zlu.dao.UserDao1;
import com.zlu.dao.UserDao3;
import org.springframework.context.annotation.*;

//@Configuration
@ComponentScan("com.zlu")
//@EnableAspectJAutoProxy
//@Import(MyImportSelter.class)//import能处理三种类 处理importselter类
//@Import(UserDao.class)//处理普通类
//@Import(ImportBeanDefinitionRegistrar.class)//处理ImportBeanDefinitionRegistrar类
//@ImportResource("spring.xml")

public class AppConfig {

	//没有加@Configuration 打印两个dao1-init ，加了，就说明产生了cglib代理，只调用代理方法userDao 所以打印一个ao1-init


	@Bean //spring解析这个bean的时候是getBean（）
	public  Dao userDao3(){

		return new UserDao3();
	}
//
	@Bean  //spring解析这个bean的时候new 一个
	public UserDao userDao(){
		userDao3();
		return new UserDao();
	}
}
