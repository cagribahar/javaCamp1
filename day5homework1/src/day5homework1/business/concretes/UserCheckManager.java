package day5homework1.business.concretes;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5homework1.business.abstracts.RegisterService;
import day5homework1.business.abstracts.UserCheckService;
import day5homework1.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	RegisterService registerService;
	List<String>emails= new ArrayList<String>();
	
	
	public UserCheckManager(RegisterService registerService) {
		
		this.registerService=registerService;
	}
	@Override
	public boolean checkName(User user) {
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		} else {
			System.out.println("�sim ve soyisim 3 harften az olamaz");
		}
		return false;
	}

	@Override
	public boolean checkEmail(User user) {
		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(user.geteMail());

		Pattern pattern2 = Pattern.compile(".com");
		Matcher matcher2 = pattern2.matcher(user.geteMail());

		if (matcher.find() && matcher2.find() && checkEmailExist(user)) {
			return true;
		}

		else {
			System.out.println("Kullan�c� email'i hatal�d�r");
		}
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() > 5) {
			return true;
		} else {
			System.out.println("�ifre 6 karakterden az olamaz");
		}
		return false;
	}
	@Override
	public boolean checkEmailExist(User user) {
		
		for(String email : emails) {
			if(email.equals(user.geteMail())) {
				System.out.println("E mail al�nm��t�r yeniden deneyin");
				return false;
			}
		}
		emails.add(user.geteMail());
		return true;
	}
	
	

	
	
}
