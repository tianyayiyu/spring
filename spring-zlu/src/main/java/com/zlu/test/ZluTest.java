package com.zlu.test;

import com.zlu.config.AppConfig;
import com.zlu.config.AppConfig1;
import com.zlu.config.DBConfig;
import com.zlu.config.MyBeanFactoryProcessor;
import com.zlu.dao.Dao;
import com.zlu.dao.UserDao;
import com.zlu.dao.UserDao2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.xml.SimpleNamespaceContext;

/**
 *ApplicationContextAwareProcessor
 */
public class ZluTest {
	public static void main(String[] args) {

		/*java中的类用Class描述,比如
		 class User{
		 }
		 用class描述User类的信息
				 class{
			name;//类名 com.zlu.entrty.User
			SimpleName;//类名称 User
			Methods[];//User中的方法
		}*/
		/*spring中的bean用BeanDefinition描述*/

		/*描述Bean的接口有三种 ：AnnotatedBeanDefinition注解的定义，xml的，spring内部的*/
		//spring的初始化，把spring的所有前提准备 实例化一个工厂DefaultListableBeanFactory，在父类中完成的
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		//context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		context.register(AppConfig1.class);
		//读取bean
		//context.register(UserDao.class);
		//context.scan("");
		//初始化spring环境，包括bean的实例化，解析
		context.refresh();
		//以上步骤已经完成了扫描，但是扫描工作(AppConfig里面的@ComponentScan("com.zlu"))
		// 不是AnnotationConfigApplicationContext里面的scanner完成的,
		//程序员添加 context.scan(""); 是scanner完成扫描的
		Dao bean = (Dao) context.getBean("userDao");
		//AppConfig bean =  context.getBean(AppConfig.class);
//
		//bean.userDao();
		//Dao bean1 = (Dao) context.getBean("userDao");
		bean.query();
		//System.out.println(bean.hashCode()+"--------"+bean1.hashCode());
		//System.out.println(context.getBean("zluService"));

		//@MapperScan（） 就是能够将接口转换为Object，放到spring容器中
	}
}
