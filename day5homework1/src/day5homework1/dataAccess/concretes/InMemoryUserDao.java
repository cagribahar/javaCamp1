package day5homework1.dataAccess.concretes;


import java.util.List;

import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	

	
	@Override
	public void add(List <User> users,User user) {
		
		System.out.println("Kullanýcý eklendi : "+user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void delete(List <User> users,User user) {
	
		System.out.println("Kullanýcý silindi : "+user.getFirstName());
		users.remove(user);
	}

	@Override
	public void showInfo(User user) {
		
		System.out.println(user);
		
	}

	@Override
	public void showAllUsers(List <User> users) {
		
		for(User user : users) {
			
			System.out.println(user);
		}
		
	}


	

}
