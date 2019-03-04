package com.zlu.springLister;

import org.springframework.context.ApplicationListener;

public class SpringMailLister implements ApplicationListener<SpringEvent> {
	@Override
	public void onApplicationEvent(SpringEvent event) {
		System.out.println("mail send");
	}
}
