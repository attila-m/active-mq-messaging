package com.activemq.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsPublisher {
	private static final Logger logger = LoggerFactory.getLogger(JmsPublisher.class);
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jsa.activemq.topic}")
	String topic;
	
	public void send(String message){
		jmsTemplate.convertAndSend(topic, message);
		logger.info("Message : {} published to topic: {} successfully.", message, topic);
		
	}
}
