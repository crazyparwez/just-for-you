package com.example.Mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MangoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
		System.out.println("mango,...");
		System.out.println("it is orange"+new Orange());
		System.out.println("hello babayljsfjsljf");
	}

}
