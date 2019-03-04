package com.zlu.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Movie implements Runnable{

	List<MovieLister> list=new ArrayList<>();

	public void addLister(MovieLister movieLister){
		list.add(movieLister);
	}

	/**
	 * 播放电影
	 */
	public void play(){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/**
		 * 当电影到某个情节的时候，观察者发生动作
		 */
		MovieEvent event=new MovieEvent();
		event.setContext("说话内容");
		event.setType(1);//并且是温情片

		for (MovieLister lister : list) {
			lister.update(event);
		}
	}


	@Override
	public void run() {
		play();
	}

}
