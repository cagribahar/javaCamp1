package day5homework1.entities.concretes;

public class User {

	int id;
	String firstName;
	String lastName;
	String eMail;
	String password;
	boolean Isverified=false;

	public User() {
		
	}

	public User(int id, String firstName, String lastName, String eMail, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public boolean isIsverified() {
		return Isverified;
	}

	public void setIsverified(boolean isverified) {
		Isverified = isverified;
	}

	@Override
	public String toString() {
		return "User id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail
				+ ", password=" + password + ", Isverified=" + Isverified ;
	}
	
	
}
