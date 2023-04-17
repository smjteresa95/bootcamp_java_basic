package this_human;

public class HumanMain {
	
	public static void main(String[] args) {
		Human kim = new Human("chulsoo", 20);
		kim.showInfo();
		
		Human park = new Human("younghee");
		park.showInfo();
		
		Human noName = new Human();
		noName.showInfo();
		
		
	}

}
