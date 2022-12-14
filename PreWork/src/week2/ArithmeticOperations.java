package week2;

import java.util.Scanner;

public class ArithmeticOperations {
	
	public static void main (String [] args) {
		
		int num1;
		int num2;
		 
	 System.out.println("Enter two numbers ");
     try (Scanner sc = new Scanner(System.in)) {
		num1 = sc.nextInt();
		 num2 = sc.nextInt();
	}
     
     //Addition
     System.out.println(num1+num2);
     // Subtraction
     System.out.println(num1-num2);
     // Division
     System.out.println(num1/num2);
     // multiplication
     System.out.println(num1*num2);
     
	}

}
