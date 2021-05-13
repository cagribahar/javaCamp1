package com.example.day6homework1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SystemWorkerUsers")
public class SystemUser  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private int userId;
	
	
	@Column(name="Name")
	private String firstName;
	
	
	@Column(name="Surname")
	private String lastName;

	public SystemUser() {
		
	}
	
	public SystemUser(int userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
