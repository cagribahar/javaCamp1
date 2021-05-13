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
@Table(name="JobCategorys")
public class JobCategory  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CategoryId")
	private int id;
	
	
	@Column(name="CategoryName")
	private String categoryName;

	public JobCategory() {
		
	}
	
	public JobCategory(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	
	
	
	
	
}
