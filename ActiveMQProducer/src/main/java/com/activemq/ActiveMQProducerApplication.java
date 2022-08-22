package com.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activemq.jms.JmsPublisher;

@SpringBootApplication
public class ActiveMQProducerApplication implements CommandLineRunner {

	@Autowired
	JmsPublisher publisher;

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		publisher.send("This is my very cool message 1. ");
		publisher.send("This is my very cool message 2. ");
		publisher.send("This is my very cool message 3. ");

	}
}
