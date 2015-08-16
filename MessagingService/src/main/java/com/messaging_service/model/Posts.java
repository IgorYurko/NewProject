package com.messaging_service.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Posts implements Serializable {


	private static final long serialVersionUID = -1592354244394993782L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="source")
	private String source;
	
	@Column(name="datetime")
	private Date datetime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Category category;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Users users;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="posts_id")
	private List<Messages> messages;

	public Posts() {
		super();
		
	}

	public Posts(int id, String title, String description, String source,
			Date datetime, Category category, Users users, List<Messages> messages) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.source = source;
		this.datetime = datetime;
		this.category = category;
		this.users = users;
		this.messages = messages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Messages> getMessages() {
		return messages;
	}

	public void ListMessages(List<Messages> messages) {
		this.messages = messages;
	}
	
	
}
