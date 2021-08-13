package com.training.ifaces;

import com.training.model.CreditCard;

public interface CreditCardRepository {

	public boolean add(CreditCard entity) throws NullPointerException;
	public boolean findAll() throws Exception;
	
}
