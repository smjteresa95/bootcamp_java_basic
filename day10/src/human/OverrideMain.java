package human;

public class OverrideMain {
	public static void main(String[] args) {
		Student st = new Student("minjee", 29, "CS");
		Programmer pg = new Programmer("Minjee", 20, "Gold", "Seoul");
		
		st.introduction();
		pg.coding();
		
		System.out.println(pg.getLevel());
		
	}

}
