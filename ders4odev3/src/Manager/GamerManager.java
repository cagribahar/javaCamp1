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
			System.out.println("Kullanýcý baþarýyla eklendi : "+gamer.getFirstName());
		}
		else {
		 System.out.println("Kullanýcý bilgileri hatalýdýr yeniden deneyin");
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
		System.out.println("Kullanýcý bilgileri güncellendi ");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		
		System.out.println("Kullanýcý silindi : "+gamer.getFirstName());
		
	}

	@Override
	public void addMoneyToAccount(Gamer gamer, double moneyAmount) {
		
		
		gamer.setAccountBalance(gamer.getAccountBalance()+moneyAmount);
		System.out.println("Ýþlem baþarý ile gerçekleþti Yeni Bakiye : "+gamer.getAccountBalance());
		
	}

}
