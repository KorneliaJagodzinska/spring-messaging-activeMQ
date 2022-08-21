package com.example.springmessagingactiveMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringMessagingActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMessagingActiveMqApplication.class, args);
	}

}
