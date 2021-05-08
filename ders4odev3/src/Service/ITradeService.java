package Service;

import Entity.Game;
import Entity.Gamer;

public interface ITradeService {

	void buyGame(Gamer gamer,Game game);
	void SellGame(Gamer gamer,Game game);
}
