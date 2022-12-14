package week2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int a;
	System.out.println("enter a year");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	sc.close();
	
	if(a%400==0) {
		System.out.println("the year is a leap year");
	
	}
	else if(a%4==0&a%100!=0) {
		System.out.println("the year is a leap year");
	}
	else {
		System.out.println("the year is not a leap year");
	}
	} 

}
