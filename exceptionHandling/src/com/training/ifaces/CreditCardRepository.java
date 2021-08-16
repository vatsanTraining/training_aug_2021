package com.training.ifaces;

import com.training.model.CreditCard;
/**
 * 
 * @author vatsan
 *
 */
public interface CreditCardRepository {

	/**
	 * 
	 * @param entity
	 * @return
	 * @throws NullPointerException
	 */
	public boolean add(CreditCard entity) throws NullPointerException;
	public boolean findAll() throws Exception;
	
}
