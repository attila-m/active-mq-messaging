package com.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActiveMQNonDurableConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQNonDurableConsumerApplication.class, args);
	}
}
