package com.zlu.dao;

import org.springframework.stereotype.Repository;

//@Repository("userDao")
public class UserDao implements Dao{
	public UserDao(){
		System.out.println("userDao constract");
	}

//	private String name;
//	public UserDao(String name){
//		this.name=name;
//	}
//
//	@PostConstruct
//	public void init(){
//		System.out.println("userDao init");
//	}
	public void query(){
		System.out.println("query");
	}
}
