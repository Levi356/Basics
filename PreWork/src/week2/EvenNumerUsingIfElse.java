package week2;

import java.util.Scanner;

public class EvenNumerUsingIfElse {

	

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
	    sc.close();
	    
	    if (a%2==0) {
	    	System.out.println("Number is even");
	    	
	    }
	    else {
	    	System.out.println("Number is odd");
	    }
	          

	}

}
