package com.zlu.fordepend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

	@Autowired
	private ClassB classB;


	public void a(){
		classB.b();
	}
}
