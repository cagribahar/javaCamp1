package com.example.day6homework1.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="JobSeekerUsers")
public class JobSeekerUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private int userId;
	
	@Column(name="Name")
	private String firstName;
	
	@Column(name="Surname")
	private String lastName;
	
	@Column(name="NationalityId")
	private String nationalityId;
	
	@Column(name="DateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="JobCategoryId")
	private int jobCategoryId;

	
	
	
	public JobSeekerUser() {
		
	}
	
	public JobSeekerUser(int userId, String firstName, String lastName, String nationalityId, Date dateOfBirth,
			int jobCategoryId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.jobCategoryId = jobCategoryId;
	}
	
	
	
	
}
