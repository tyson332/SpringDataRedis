package com.redis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.redis.app")
public class SpringDataRedisIntegration {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisIntegration.class, args);
	}
}
