package com.example.day6homework1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day6homework1.business.abstracts.UserService;
import com.example.day6homework1.dataAccess.abstracts.UserDao;
import com.example.day6homework1.entities.concretes.BaseUser;

@Service
public class UserManager implements UserService{
	
	
	
	
	private UserDao userDao;
	
	
	
	


	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}







	@Override
	public List<BaseUser> getAll() {
		
		return this.userDao.findAll();
	}

}
