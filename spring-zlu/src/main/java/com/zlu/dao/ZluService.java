package com.zlu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//Service
public class ZluService {

	//@Autowired
	//private Dao userDao;
	private ZluService1 zluService1;

	//public static Object query(){
	//	return new Zlu();
	//}

	//@PostConstruct
	public void query1(){
		//userDao.query();
	}

}
