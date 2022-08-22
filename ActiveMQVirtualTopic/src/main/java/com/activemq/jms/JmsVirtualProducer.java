package com.activemq.jms;

import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsVirtualProducer {
	private static final Logger logger = LoggerFactory.getLogger(JmsVirtualProducer.class);

	@Autowired
	JmsTemplate jmsTemplate;

	public void send(String message){
		jmsTemplate.convertAndSend(new ActiveMQTopic("VirtualTopic.my-virtual-topic"), message);
		logger.info("Received message... " + message);
	}
}
