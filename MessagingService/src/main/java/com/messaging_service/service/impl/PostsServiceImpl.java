package com.messaging_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messaging_service.dao.IPostsDao;
import com.messaging_service.model.Posts;
import com.messaging_service.service.IPostsService;


@Service
public class PostsServiceImpl extends AbstractService<Posts> implements IPostsService {
	
	@Autowired
    private	IPostsDao dao;
	
	@Override
	protected IPostsDao getDao() {
		return dao;
	}

}
