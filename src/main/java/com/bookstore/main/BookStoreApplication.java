package com.bookstore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bookstore.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackages={"com.bookstore.controller","com.bookstore.model"} )   //Classes=HomeController.class)
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
}
