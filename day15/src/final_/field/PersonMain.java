package final_.field;

public class PersonMain {
	public static void main(String[] args) {
		Person kim = new Person("Java Kim");
		
		//final이라 변경 불가
		kim.nationality = "USA";
		//final이라 변경 불가
		kim.name "Spring Kim";
		
		kim.age=20;
		
		//Public이라 조회 가능.
		System.out.println(kim.nationality);
		System.out.println(kim.name);
		System.out.println(kim.age);
		
	}
}
