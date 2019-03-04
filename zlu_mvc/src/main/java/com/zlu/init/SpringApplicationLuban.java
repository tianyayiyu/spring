package com.zlu.init;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.io.File;

public class SpringApplicationLuban {

	public static  void run() {
		AnnotationConfigWebApplicationContext zct=new AnnotationConfigWebApplicationContext();
		zct.register(AppConfig.class);
		zct.refresh();

		File base=new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

		Context root = tomcat.addContext("/", base.getAbsolutePath());

		DispatcherServlet servlet= new DispatcherServlet(zct);

		Tomcat.addServlet(root,"luban",servlet).setLoadOnStartup(1);

		root.addServletMapping("/","luban");

		//tomcat.addWebapp("/",base.getAbsolutePath());
		//tomcat.addContext("/","/");
		//mvc1/target/classes
		//String sourcePath =
		//告訴tomcat你的源碼在哪裏
		//Context ctx = tomcat.addWebapp("/",new File("src/main/webapp").getAbsolutePath());
		//WebResourceRoot resources = new StandardRoot(ctx);
		//resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",

		//		sourcePath, "/"));
		//ctx.setResources(resources);
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

		/**
		 * addWebapp 表示这是一个web项目
		 * contextPath:表示tomcat的访问路径
		 * docBase:项目的web目录，所以不能用addWebapp
		 */
		//Context ctx = tomcat.addWebapp("/",new File("src/main/webapp").getAbsolutePath());

		//Context ctx1 = tomcat.addContext("/",new File("src/main/webapp").getAbsolutePath());

		// Load Spring web application configuration
//		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//		ac.register(AppConfig.class);
//		ac.refresh();
//
//		// Create and register the DispatcherServlet
//		DispatcherServlet servlet = new DispatcherServlet(ac);
//
//		ServletContext servletContext=servlet.getServletContext();
//		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
//		//tomcat在启动的时候就会调用DispatcherServlet 的init方法
//		//init()方法就是用来初始化controller和请求映射的
//		registration.setLoadOnStartup(1);
//		registration.addMapping("*.do");
	}
}
