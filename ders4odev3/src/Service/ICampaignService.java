package Service;

import Entity.Campaign;
import Entity.Game;

public interface ICampaignService {

	void addCampaign(Campaign campaign);
	void injectCampaign(Campaign campaign,Game[] games);
	void updateCampaign(Campaign campaign, int id, String name, double rate);
	void deleteCampaign(Campaign campaign);
}
