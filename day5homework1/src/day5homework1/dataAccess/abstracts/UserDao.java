package day5homework1.dataAccess.abstracts;

import java.util.List;

import day5homework1.entities.concretes.User;


public interface UserDao {

	void add(List <User> users,User user);
	void delete(List <User> users,User user);
	void showInfo( User user);
	void showAllUsers(List <User> users);
}
