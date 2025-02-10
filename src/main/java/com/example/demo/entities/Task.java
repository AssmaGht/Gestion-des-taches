package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		
	private Long id;
	private String description ;
	private Date datedebut;
	
	@ManyToOne
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task(Long id, String description, Date datedebut, User user) {
		super();
		this.id = id;
		this.description = description;
		this.datedebut = datedebut;
		this.user = user;
	}

	public Task() {
		super();
	}

	

}
