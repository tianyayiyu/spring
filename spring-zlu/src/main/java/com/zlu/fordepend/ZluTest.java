package com.zlu.fordepend;

import com.zlu.config.AppConfig1;
import com.zlu.dao.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *ApplicationContextAwareProcessor
 */
public class ZluTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//context.getBean(ClassA.class).a();
	}
}
