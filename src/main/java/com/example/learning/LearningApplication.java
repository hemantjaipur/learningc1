package com.example.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("Application has been started");
		SpringApplication.run(LearningApplication.class, args);
	}

	// This interface is particularly useful for executing code that needs to run once, 
	// right after the application startup.
	@Override
	public void run(String... args) {
		System.out.println("Command line running started");

	}

}
