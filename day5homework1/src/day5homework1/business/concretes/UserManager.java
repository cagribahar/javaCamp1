package day5homework1.business.concretes;

import java.util.Scanner;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.business.abstracts.UserService;
import day5homework1.entities.concretes.User;

public class UserManager extends UserCheckManager implements UserService{

	
	 public UserManager(RegisterService registerService) {
		super(registerService);
		
	}
	 
	 
	
	@Override
	public void verify(User user) {
		
		System.out.println("E-postan�za do�rulama maili g�nderilmi�tir l�tfen hesab�n�z� do�rulay�n");
		System.out.println("Hesap do�ruland�");
		user.setIsverified(true);
		
	}

	@Override
	public void register(User user) {
		
		
		if(checkEmail(user)&& checkName(user)&& checkPassword(user)) {
			registerService.register(user);
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal�d�r");
		}
	}



	@Override
	public void login(User user) {
		String password;
		Scanner reader= new Scanner(System.in);
		System.out.println("�ifrenizi giriniz");
		password=reader.next();
		
		if(password.equals(user.getPassword())) {
			System.out.println("Giri� ba�ar�l�");
			return;
		}
		System.out.println("�ifre Yanl�� yeniden deneyiniz");
		
		
	}



	@Override
	public void logout(User user) {
		
		System.out.println("��k�� yap�lm��t�r");
		
	}

}
