package com.messaging_service.dao.impl;

import org.springframework.stereotype.Repository;

import com.messaging_service.dao.IUsersDao;
import com.messaging_service.model.Users;

@Repository
public class UsersDaoImpl extends AbstractDaoImpl<Users> implements IUsersDao{

	public UsersDaoImpl() {
		super();
		
		setClazz(Users.class);
	}
	
}
