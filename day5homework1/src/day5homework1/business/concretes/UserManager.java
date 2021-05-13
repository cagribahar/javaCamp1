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
			System.out.println("Kullanýcý doðrulamasý yapýlmýþtýr bir defa daha yapýlmaz");
			return;
		}
		System.out.println("E-postanýza doðrulama maili gönderilmiþtir lütfen hesabýnýzý doðrulayýn");
		System.out.println("Hesap doðrulandý");
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
		System.out.println("Þifrenizi giriniz");
		password=reader.next();
		
		if(password.equals(user.getPassword())) {
			System.out.println("Giriþ baþarýlý");
			return;
		}
		System.out.println("Þifre Yanlýþ yeniden deneyiniz");
		
		
	}



	@Override
	public void logout(User user) {
		
		System.out.println("Çýkýþ yapýlmýþtýr");
		
	}

}
