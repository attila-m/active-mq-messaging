package com.activemq.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class JmsSubcriber {
	private static final Logger logger = LoggerFactory.getLogger(JmsSubcriber.class);
	
	@JmsListener(destination = "${jsa.activemq.topic}")
	public void receive(String message){
		logger.info("Recieved Message:  {}", message);
	}
}
