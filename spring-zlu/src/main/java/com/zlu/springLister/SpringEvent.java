package com.zlu.springLister;

import org.springframework.context.ApplicationEvent;

public class SpringEvent extends ApplicationEvent {

	private String context;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public SpringEvent(Object source) {
		super(source);
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
