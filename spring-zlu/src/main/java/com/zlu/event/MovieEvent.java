package com.zlu.event;

/**
 * 电影事件
 */
public class MovieEvent {
	private String context;//电音内容
	private int type;//电影类型

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
