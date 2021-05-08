package day5homework1.business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.business.abstracts.UserCheckService;
import day5homework1.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	RegisterService registerService;
	
	public UserCheckManager(RegisterService registerService) {
		
		this.registerService=registerService;
	}
	@Override
	public boolean checkName(User user) {
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		} else {
			System.out.println("İsim ve soyisim 3 harften az olamaz");
		}
		return false;
	}

	@Override
	public boolean checkEmail(User user) {
		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(user.geteMail());

		Pattern pattern2 = Pattern.compile(".com");
		Matcher matcher2 = pattern2.matcher(user.geteMail());

		if (matcher.find() && matcher2.find()) {
			return true;
		}

		else {
			System.out.println("Kullanıcı email'i hatalıdır");
		}
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() > 5) {
			return true;
		} else {
			System.out.println("Şifre 6 karakterden az olamaz");
		}
		return false;
	}
	@Override
	public boolean checkEmailExist(List<User>users,User user) {
		
		for(User user1 : users) {
			if(user1.geteMail().equals(user.geteMail())) {
				System.out.println("E mail alınmıştır yeniden deneyin");
				return true;
			}
		}
		return false;
	}

	
	
}
