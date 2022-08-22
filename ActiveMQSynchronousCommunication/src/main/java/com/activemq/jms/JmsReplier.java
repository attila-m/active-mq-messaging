package com.activemq.jms;

import javax.jms.JMSException;
import javax.jms.Message;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class JmsReplier {
    private static final Logger logger = LoggerFactory.getLogger(JmsRequestor.class);

    @JmsListener(destination = "${jsa.activemq.sync.communication.request.queue}")
    @SendTo("${jsa.activemq.sync.communication.reply.queue}")
    public String processRequest(Message message) throws JMSException {
        ActiveMQTextMessage textMessage = (ActiveMQTextMessage) message;

        logger.info("Received message from request channel: " + textMessage.getText());
        logger.info("Sending reply");

        return "Success";
    }

}
