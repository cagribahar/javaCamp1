package day5homework1.business.concretes;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.entities.concretes.User;

public class RegisterManager implements RegisterService {

	@Override
	public void register(User user) {
	
	   System.out.println("Kullanýcý site üzerinden kaydedildi");
		
		
	}

}
