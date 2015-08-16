package com.messaging_service.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Preconditions;
import com.messaging_service.dao.IOperations;

@SuppressWarnings("unchecked")
public abstract class AbstractDaoImpl<T extends Serializable> implements IOperations<T> {

	private Class<T> clazz;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	protected final void setClazz(final Class<T> clazzToSet) {
		clazz = Preconditions.checkNotNull(clazzToSet);
	}
	

	@Override
	public final List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	@Override
	public final void create(final T entity) {
		Preconditions.checkNotNull(entity);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		try{
		
		session.saveOrUpdate(entity);
		transaction.commit();
		
		
		}catch(Throwable e){
			transaction.rollback();
			
		}finally{
			
			session.close();
			
		}
	 }
	
}
