package com.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activemq.jms.JmsRequestor;

@SpringBootApplication
public class ActiveMQSynchronousApplication implements CommandLineRunner {

	@Autowired
	JmsRequestor requestor;

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQSynchronousApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		requestor.send("This is my very cool message 1. ");
		requestor.send("This is my very cool message 2. ");
		requestor.send("This is my very cool message 3. ");

	}
}
