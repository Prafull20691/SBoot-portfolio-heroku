package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SBootHerokuAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBootHerokuAppApplication.class, args);
		//logger.info("Spring boot and heroku application started successfully.");
	}

}
