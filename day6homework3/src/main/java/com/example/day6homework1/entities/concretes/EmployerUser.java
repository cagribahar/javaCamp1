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
@Table(name="EmployerUsers")
public class EmployerUser  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private int userId;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="Website")
	private String websiteUrl;

	
	public EmployerUser() {
		
	}
	
	
	public EmployerUser(int userId, String companyName, String phoneNumber, String websiteUrl) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.websiteUrl = websiteUrl;
	}
	
	
	
	
	
}
