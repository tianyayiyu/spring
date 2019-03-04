package com.zlu.config;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	Object target;
	public  MyInvocationHandler(Object target){
		this.target=target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("進來了");
		Object aa = method.invoke(target, args);
		System.out.println("出去了");
		return aa;
	}
}
