package day5homework1.business.abstracts;

import day5homework1.entities.concretes.User;

public interface UserService {

	void verify(User user);

	void register(User user);

	void login(User user);
	
	void logout(User user);
}
