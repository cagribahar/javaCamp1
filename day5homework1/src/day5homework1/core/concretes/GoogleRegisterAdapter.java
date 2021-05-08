package day5homework1.core.concretes;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.entities.concretes.User;

public class GoogleRegisterAdapter implements RegisterService{

	public void register(User user) {
		
		System.out.println("Kullanýcý kaydý google ile yapýldý");
	}
}
