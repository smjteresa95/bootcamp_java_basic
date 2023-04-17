package human;

public class Programmer extends Human{
	
	private String level;
	private String workingLocation;
	
	public Programmer(String name, int age, String level, String workingLocation) {
		super(name, age);
		this.level=level;
		this.workingLocation=workingLocation;
	}
	
	@Override
	public void coding() {
		System.out.println("코딩 가능합니다.");
	}
	
	public String getLevel() {
		return this.level;
	}

}
