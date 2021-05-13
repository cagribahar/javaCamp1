package com.example.day6homework1.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6homework1.entities.concretes.BaseUser;

public interface UserDao extends JpaRepository<BaseUser, Integer>{

	
}
