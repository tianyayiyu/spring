package com.zlu.event;

	/**
	 * 观察者1
	 */
	public class Master implements MovieLister{


		public void update(MovieEvent event) {
			if(event.getType()==1){
				System.out.println("simle");
			}
		}
	}
