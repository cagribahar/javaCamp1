package Manager;

import Entity.Campaign;
import Entity.Game;
import Service.ICampaignService;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar� ile eklendi : "+campaign.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign, int id, String name, double rate) {
		
		campaign.setId(id);
		campaign.setName(name);
		campaign.setRate(rate);
		System.out.println("Kampanya ba�ar� ile g�ncellendi : "+campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar� ile silindi : "+campaign.getName());
		
	}
	
	public void injectCampaign(Campaign campaign,Game[] games) {
		
		System.out.println(campaign.getName()+" ile y�zde "+campaign.getRate()+" indirim uyguuland�");
		
		for(Game game : games) {
			
			game.setPrice(game.getPrice()-(game.getPrice()*campaign.getRate()/100));
		}
	}

	
}
