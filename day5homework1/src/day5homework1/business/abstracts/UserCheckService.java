package day5homework1.business.abstracts;



import day5homework1.entities.concretes.User;

public interface UserCheckService {

	

	boolean checkName(User user);

	boolean checkEmail(User user);

	boolean checkPassword(User user);
	
	boolean checkEmailExist(User user);
	
	
	


}
