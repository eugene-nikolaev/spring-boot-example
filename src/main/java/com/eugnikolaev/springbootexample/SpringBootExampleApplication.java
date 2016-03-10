package com.eugnikolaev.springbootexample;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eugnikolaev.springbootexample.filters.RequestLogFilter;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
	
	@Bean
	public Filter compressingFilter() {
	    return new RequestLogFilter();
	}

}
