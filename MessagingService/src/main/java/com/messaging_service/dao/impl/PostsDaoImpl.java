package com.messaging_service.dao.impl;

import org.springframework.stereotype.Repository;

import com.messaging_service.dao.IPostsDao;
import com.messaging_service.model.Posts;

@Repository
public class PostsDaoImpl extends AbstractDaoImpl<Posts> implements IPostsDao {

	public PostsDaoImpl() {
		super();
		
		setClazz(Posts.class);
		
	}
	
}
