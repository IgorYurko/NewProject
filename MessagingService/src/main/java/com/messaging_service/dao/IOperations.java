package com.messaging_service.dao;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable> {

	List<T> findAll();
	
	void create(final T entity);
	      
	
}
