package com.example.day6homework1.business.abstracts;

import java.util.List;

import com.example.day6homework1.entities.concretes.BaseUser;

public interface UserService {

	
	List<BaseUser> getAll();
}
