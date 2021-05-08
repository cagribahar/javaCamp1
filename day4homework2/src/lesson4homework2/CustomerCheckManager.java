package lesson4homework2;

public class CustomerCheckManager implements ICustomerCheckService{


	MernisCheckManager client= new MernisCheckManager();
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return client.checkIfRealPerson(customer);
	}

}
