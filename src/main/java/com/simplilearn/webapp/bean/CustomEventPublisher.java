package com.simplilearn.webapp.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;		
	}

	// publish event
	public void publish() {
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);
	}
}
