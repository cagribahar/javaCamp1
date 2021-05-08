package Manager;

import Entity.Gamer;
import Service.IUserCheckService;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean isValidPerson(Gamer gamer) {
		
		if(gamer.getNationalityId().length()==11)
		{
			return true;
		}
		return false;
	}

}
