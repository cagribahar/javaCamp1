package Manager;

import Entity.Game;
import Entity.Gamer;
import Service.ITradeService;

public class TradeManager implements ITradeService{

	@Override
	public void buyGame(Gamer gamer, Game game) {
		if(gamer.getAccountBalance()<game.getPrice()) {
			System.out.println("Bakiyeniz yeterli de�il");
		}
		else {
			gamer.setAccountBalance(gamer.getAccountBalance()-game.getPrice());
			System.out.println("Sat�n al�m ba�ar�l� ile ger�ekle�ti Yeni bakiye: "+gamer.getAccountBalance());
		}
		
	}

	@Override
	public void SellGame(Gamer gamer, Game game) {
		gamer.setAccountBalance(gamer.getAccountBalance()+game.getPrice());
		System.out.println("Oyun "+game.getPrice()+" birime sat�ld�"+" Yeni bakiye : "+gamer.getAccountBalance());
		
	}

}
