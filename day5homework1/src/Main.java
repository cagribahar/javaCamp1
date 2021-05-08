import java.util.ArrayList;
import java.util.List;


import day5homework1.business.concretes.RegisterManager;
import day5homework1.business.concretes.UserManager;
import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.dataAccess.concretes.InMemoryUserDao;
import day5homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new InMemoryUserDao();
		UserManager userManager = new UserManager(new RegisterManager());
		User user = new User(1,"Çaðrý","Bahar","bilalbahar.908@hotmail.com","123456");
		User user2 = new User(1,"Bilal","Bahar","bilalbahar.908@hotmail.com","123456");
		List <User> users=new ArrayList<>();
		userManager.checkEmail(user);
		userDao.add(users,user);
		userDao.add(users, user2);
		userManager.verify(user2);
	
		
		userDao.showAllUsers(users);
		
		
	}

}
