package day06;

import java.util.Scanner;

public class HomeWork {
	
	
	public static void randomMenu() {
		int menuNum = (int)(Math.random()*9);
		
		String[] lunchMenu = {"salad", "burger", "Kimbab", "Poke", "Ramen", "sandwich", "Pho", "Curry", "Fried rice", "N/A"};
		System.out.println(lunchMenu[menuNum]);
	}
	
	public static void questionAns(String str, int n) {

		str.toLowerCase();
		
		if(str.equals("yes")) {
			for (int i =0; i<n;i++) {
				randomMenu();
			}
		}else if(str.equals("no")) {
			System.out.println("No need to recommend menu.");
		} 
	}

	
	public static void mealSelect(int num) {
		if (num==1)
			System.out.println("You've selected lunch menu.");	
		else
			System.out.println("You've selected dinner menu");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you having lunch or dinner?");
		System.out.println("1: lunch \n2: dinner");
		int num = input.nextInt();
		mealSelect(num);
		
		System.out.println("Are you starving?: Yes or No");
		String starv = input.next();
		
		System.out.println("How many menus would you like to select?:");
		int n  = input.nextInt();
		
		questionAns(starv, n);

		
		
	}

}
