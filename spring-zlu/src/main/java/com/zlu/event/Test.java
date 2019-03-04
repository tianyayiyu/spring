package com.zlu.event;

public class Test {
	public static void main(String[] args) {
		Movie movie=new Movie();
		Master master=new Master();//班长
		FatTiger tiger=new FatTiger();

		movie.addLister(master);
		movie.addLister(tiger);
		Thread thread1=new Thread(movie);
		thread1.start();
	}
}
