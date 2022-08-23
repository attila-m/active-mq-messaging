package com.activemq.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsVirtualConsumer2 {
    private static final Logger logger = LoggerFactory.getLogger(JmsVirtualProducer.class);

    @JmsListener(destination = "Consumer.consumer1.VirtualTopic.my-virtual-topic")
    public void receive(String message){
        logger.info("Consumer2!!! Recieved Message:  {}", message);
    }

}
