package example.encap.good;

public class MyBirthday {
	/*
	 * 은닉(캡슐화)시 변수는 무조건 private으로 처리
	 */
	private int year;
	private int month;
	private int day;
	
	// alt + shift + s 혹은 마우스 우클릭 -> source
		// >> generate constructor using field 선택
	
	public MyBirthday(int month, int day, int year) {
		
		if (month<0 || month>12) 
		{
			System.out.println("wrong month number");
		} 
		else
			this.month = month;
		
		if (day<1 || day>31) 
		{
			System.out.println("wrong date number.");
		}
		else 
			this.day = day;
		
		
		if(year<1900 || year>2030) {
			System.out.println("wrong year number");
		}else 
			this.year = year;
		
	}
	
	
	public void showDateInfo() {
		System.out.printf("My birthday is %d/%d/%d.\n", this.month, this.day, this.year );
	}

	
	//Getter & Setter 조건을 집어 넣는다. 
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<1900 || year>2030) {
			System.out.println("wrong year number");
		}else
			this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month<0 || month>12) {
			System.out.println("wrong month number");
		} else
			this.month = month;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day>0 && day<32) {
			this.day = day;
		}else {
			System.out.println("wrong date number.");
		}
	}
	
	
	

}
