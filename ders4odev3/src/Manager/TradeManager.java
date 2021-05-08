package Manager;

import Entity.Game;
import Entity.Gamer;
import Service.ITradeService;

public class TradeManager implements ITradeService{

	@Override
	public void buyGame(Gamer gamer, Game game) {
		if(gamer.getAccountBalance()<game.getPrice()) {
			System.out.println("Bakiyeniz yeterli deðil");
		}
		else {
			gamer.setAccountBalance(gamer.getAccountBalance()-game.getPrice());
			System.out.println("Satýn alým baþarýlý ile gerçekleþti Yeni bakiye: "+gamer.getAccountBalance());
		}
		
	}

	@Override
	public void SellGame(Gamer gamer, Game game) {
		gamer.setAccountBalance(gamer.getAccountBalance()+game.getPrice());
		System.out.println("Oyun "+game.getPrice()+" birime satýldý"+" Yeni bakiye : "+gamer.getAccountBalance());
		
	}

}
