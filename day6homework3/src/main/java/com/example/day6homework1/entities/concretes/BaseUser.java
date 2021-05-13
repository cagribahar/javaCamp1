package com.example.day6homework1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="Users")
public class BaseUser {
	
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="EmailVerified")
	private boolean emailVerified;

	
	
	public BaseUser() {
		
	}
	
	public BaseUser(int id, String email, String password, boolean emailVerified) {
		
		this.id = id;
		this.email = email;
		this.password = password;
		this.emailVerified = emailVerified;
	}

	
	
	
	
}
