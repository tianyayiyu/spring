package com.zlu.dao;

import org.springframework.stereotype.Repository;

//@Repository
public class UserDao3 implements Dao{

	public UserDao3(){
		System.out.println("userDao3 constract");
	}
//
//	@PostConstruct
//	public void init(){
//		System.out.println("userDao init");
//	}
	public void query(){
		System.out.println("query3");
	}
}
