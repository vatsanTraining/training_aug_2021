package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Component
public class Invoice {

	public Customer getCustomer() {
		return customer;
	}


	@Autowired
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Item getItem() {
		return item;
	}

	
    @Autowired
	public void setItem(Item item) {
		this.item = item;
	}


    @Value("101")
	int invoiceNumber;

	Customer customer;
	
      Item  item;
	
//      @Autowired
//	public Invoice(Customer customer, Item item) {
//		super();
//		this.customer = customer;
//		this.item = item;
//	}

    @Value("200.78")
	double amount;
	
	
	
}
