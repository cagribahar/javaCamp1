package Service;

import Entity.Gamer;

public interface IGamerService {

	void addGamer(Gamer gamer);
	void showInfo(Gamer gamer);
	void updateInfo(Gamer gamer,int id,String firstName,String lastName,String nationalityId);
	void deleteGamer(Gamer gamer);
	void addMoneyToAccount(Gamer gamer,double moneyAmount);
}
