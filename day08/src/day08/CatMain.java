package day08;

//CatMain.java
public class CatMain {
	
	public static void main(String[] args) {
		
		//create c1 instance 
		Cat c1 = new Cat("persi", 10, "white");
		// create c2 instance 
		Cat c2 = new Cat("munckin", 5,"gray");
		
		c1.showCatInfo();
		c2.showCatInfo();
	}
}
