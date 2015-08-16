package com.messaging_service.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="messages")
public class Messages implements Serializable {

	private static final long serialVersionUID = -5561558302955863069L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="message")
	private String message;
	
	@OneToOne
	@JoinColumn
	private Users users;
	
	@OneToOne
	@JoinColumn
	private Posts posts;
	

	public Messages(int id, String message, Users users, int post) {
		super();
		this.id = id;
		this.message = message;
//		this.user = user;
	}

	public Messages() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users id_users) {
		this.users = id_users;
	}

	public Posts getPosts() {
		return posts;
	}

	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	
	
}
