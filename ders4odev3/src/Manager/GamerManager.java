package Manager;

import Entity.Gamer;
import Service.IGamerService;
import Service.IUserCheckService;

public class GamerManager implements IGamerService{

	IUserCheckService _userCheckService;
	public GamerManager(IUserCheckService userCheckService) {
		
		this._userCheckService=userCheckService;
	}
	@Override
	public void addGamer(Gamer gamer) {
		
		if(_userCheckService.isValidPerson(gamer)) {
			System.out.println("Kullan�c� ba�ar�yla eklendi : "+gamer.getFirstName());
		}
		else {
		 System.out.println("Kullan�c� bilgileri hatal�d�r yeniden deneyin");
		}
		
	}

	@Override
	public void showInfo(Gamer gamer) {
		
		System.out.println(gamer);
		
	}

	@Override
	public void updateInfo(Gamer gamer, int id, String firstName, String lastName, String nationalityId) {
		
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setId(id);
		gamer.setNationalityId(nationalityId);
		System.out.println("Kullan�c� bilgileri g�ncellendi ");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		
		System.out.println("Kullan�c� silindi : "+gamer.getFirstName());
		
	}

	@Override
	public void addMoneyToAccount(Gamer gamer, double moneyAmount) {
		
		
		gamer.setAccountBalance(gamer.getAccountBalance()+moneyAmount);
		System.out.println("��lem ba�ar� ile ger�ekle�ti Yeni Bakiye : "+gamer.getAccountBalance());
		
	}

}
