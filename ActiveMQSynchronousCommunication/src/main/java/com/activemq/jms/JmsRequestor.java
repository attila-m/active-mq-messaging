package com.activemq.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsRequestor {
	private static final Logger logger = LoggerFactory.getLogger(JmsRequestor.class);

	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${jsa.activemq.sync.communication.request.queue}")
	String requestQueue;

	@Value("${jsa.activemq.sync.communication.reply.queue}")
	String replyQueue;

	public void send(String message){
		logger.info("Sending request to request queue... " + requestQueue);
		jmsTemplate.convertAndSend(requestQueue, message);
		Object replyObject = jmsTemplate.receiveAndConvert(replyQueue);
		logger.info("Received reply... " + replyObject);
	}
}
