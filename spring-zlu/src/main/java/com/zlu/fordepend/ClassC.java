package com.zlu.fordepend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassC {

	@Autowired
	private ClassA classA;


	public void c() {
	}
}
