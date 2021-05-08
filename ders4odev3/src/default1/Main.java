package default1;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Manager.CampaignManager;
import Manager.GamerManager;
import Manager.TradeManager;
import Manager.UserCheckManager;
import Service.ICampaignService;
import Service.IEntity;
import Service.IGamerService;
import Service.ITradeService;

public class Main {

	public static void main(String[] args) {
		
		
		ICampaignService campaignManager = new CampaignManager();
		ITradeService tradeManager = new TradeManager();
		IGamerService gamerManager = new GamerManager(new UserCheckManager());
		Gamer bilal = new Gamer("Çaðrý","Bahar","1938808560",1);
		Game crysis= new Game(1,"Crysis 3",300);
		Game[] games = {crysis};
		Campaign campaign = new Campaign(1,"Yaz kampanyasý",25);
		
		gamerManager.addGamer(bilal);
		gamerManager.addMoneyToAccount(bilal, 100);
		gamerManager.deleteGamer(bilal);
		gamerManager.showInfo(bilal);
		gamerManager.updateInfo(bilal, 2, "bilal", "bahar", "19388085607");
		gamerManager.showInfo(bilal);
		
		tradeManager.buyGame(bilal, new Game(1,"Crysis 3",300));
		tradeManager.SellGame(bilal, new Game(1,"Crysis 3",300));
		
		campaignManager.injectCampaign(campaign, games);
		
		tradeManager.buyGame(bilal,crysis);

		
	}

}
