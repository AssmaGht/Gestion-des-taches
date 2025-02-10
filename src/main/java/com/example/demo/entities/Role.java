package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table 
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		
	private Long id;
	private String profil ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public Role(Long id, String profil) {
		super();
		this.id = id;
		this.profil = profil;
	}
	public Role() {
		super();
	}


	
	
}
