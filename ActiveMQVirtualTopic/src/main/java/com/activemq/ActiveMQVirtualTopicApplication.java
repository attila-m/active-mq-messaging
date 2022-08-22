package com.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activemq.jms.JmsVirtualProducer;

@SpringBootApplication
public class ActiveMQVirtualTopicApplication implements CommandLineRunner {

	@Autowired
	JmsVirtualProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQVirtualTopicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		producer.send("This is my very cool message 1. ");
		producer.send("This is my very cool message 2. ");
		producer.send("This is my very cool message 3. ");

	}
}
