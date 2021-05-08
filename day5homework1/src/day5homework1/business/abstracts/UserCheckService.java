package day5homework1.business.abstracts;

import java.util.List;

import day5homework1.entities.concretes.User;

public interface UserCheckService {

	

	boolean checkName(User user);

	boolean checkEmail(User user);

	boolean checkPassword(User user);
	
	boolean checkEmailExist(List<User>users,User user);
	
	
	


}
