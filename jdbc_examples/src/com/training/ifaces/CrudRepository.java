package com.training.ifaces;

import com.example.ifaces.Repository;

public interface CrudRepository<T> extends Repository<T> {

	public T findById(int id);
}
