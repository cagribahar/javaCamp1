package lesson4homework2;

public class Main {

	public static void main(String[] args) {
		Customer bilal = new Customer();
		bilal.firstName="Bilal";
		bilal.lastName="Bahar";
		bilal.nationalityId="19378085608";
		bilal.dateOfBirthYear=2002;
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisCheckManager());
		customerManager.save(bilal);

	}

}
