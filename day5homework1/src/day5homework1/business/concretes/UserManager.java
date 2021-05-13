package day5homework1.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.business.abstracts.UserService;
import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class UserManager extends UserCheckManager implements UserService{

	List <User> users = new ArrayList<>();
	private UserDao userDao;
	 public UserManager(RegisterService registerService,UserDao userDao) {
		super(registerService);
		this.userDao=userDao;
		
	}
	 
	 
	
	@Override
	public void verify(User user) {
		
		if(user.isIsverified()) {
			System.out.println("Kullan�c� do�rulamas� yap�lm��t�r bir defa daha yap�lmaz");
			return;
		}
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
			
		}
		userDao.add(users, user);
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
