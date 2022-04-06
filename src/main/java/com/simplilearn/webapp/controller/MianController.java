package com.simplilearn.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplilearn.webapp.bean.CustomEventPublisher;

@Controller
public class MianController {

	@RequestMapping(value="/custom-event", method = RequestMethod.GET)
	public String customEventMapping() {
		// create a application context object
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
		// tigger event from custom event publisher
		CustomEventPublisher publisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		publisher.publish();
		
		return "custom-event";
	}
}
