package study.bank.entity;

public class User {
	private String name;
	private String ssn;
	private StringBuffer address;
	
	public User(String name, String ssn, StringBuffer address) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public StringBuffer getAddress() {
		return this.address;
	}
	public void setAddress(StringBuffer address) {
		this.address=address;
	}
	
	
	
	

}
