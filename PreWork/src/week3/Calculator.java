package week3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
     
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter num1 : "); 
     int a = sc.nextInt();
     System.out.println("Enter num2 : ");
     int b = sc.nextInt();
   
     System.out.println("Enter an option from the following :");
     System.out.println("1.Add");
     System.out.println("2.Subtract");
     System.out.println("3.Divide");
     System.out.println("4.Multiply");
     
     int option = sc.nextInt();
     sc.close();
	switch(option) {
	case 1:System.out.println(a+b);break;
	case 2:System.out.println(a-b);break;
	case 3:System.out.println(a/b);;break;
	case 4:System.out.println(a*b);;
	

	}
	
	}
	}



