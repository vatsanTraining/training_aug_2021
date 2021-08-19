package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.Item;

@SpringBootApplication
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				  SpringApplication.run(SpringQuickstartApplication.class, args);
		
		
//		   Customer cust = ctx.getBean("shyam",Customer.class);
//		   
//		   System.out.println(cust);
//		
		   System.out.println(ctx.getBean("myinvoice",Invoice.class));
		
	
	
	}

	// Factory Method
	
	@Bean
	public Customer ram() {
		
		return new Customer(101,"Ramesh","ram@abc.com");
	}
	
	
	@Bean(name="prefCust")
	public Customer shyam() {
		
		return new Customer(102,"Shyam","shy@abc.com");
	}
	
	@Bean
	public Item tv() {
		
		return new Item(101,"sony tv",45000);
	}
	
	@Bean
	public Item fridge() {
		
		return new Item(102,"samsung",25000);
	}
	
//	@Bean
//	public Invoice ramsInvoice() {
//		
//		// passing reference of the Bean
//		
//		return new Invoice(901,ram(),tv(),8000);
//	}
	
	
//	@Bean
//	public Invoice shyamInvoice(@Qualifier("prefCust") Customer cust) {
//		
//		// passing reference of the Bean
//		
//		return new Invoice(902,cust,tv(),9000);
//	}
}
