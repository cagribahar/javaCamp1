package Entity;

import Service.IEntity;

public class Gamer implements IEntity{
	
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private double accountBalance;
	
	public Gamer() {
		
	}
	
	public Gamer(String firstName, String lastName, String nationalityId, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Gamer firstName=" + firstName + ", lastName=" + lastName + ", nationalityId=" + nationalityId + ", id="
				+ id + ".";
	}
	
	
	
}
