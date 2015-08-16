package com.messaging_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messaging_service.dao.IUsersDao;
import com.messaging_service.model.Users;
import com.messaging_service.service.IUsersService;

@Service
public class UsersServiceImpl extends AbstractService<Users> implements IUsersService {

	@Autowired
	private IUsersDao dao;
	
	
	@Override
	protected IUsersDao getDao() {
		
		return dao;
	}

}
