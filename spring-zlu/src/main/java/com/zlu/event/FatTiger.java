package com.zlu.event;

/**
 * 观察者
 */
public class FatTiger implements MovieLister {


	public void update(MovieEvent event) {
		if(event.getType()==1){
			System.out.println("上厕所");
		}
	}
}
