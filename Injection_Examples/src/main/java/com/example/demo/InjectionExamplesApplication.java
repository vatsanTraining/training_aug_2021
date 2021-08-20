package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;

@SpringBootApplication
public class InjectionExamplesApplication {

	
	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(InjectionExamplesApplication.class, args);
	
	
	                 Invoice inv =   ctx.getBean(Invoice.class);
	                 
	                 System.out.println(inv);
	               
	}

}
