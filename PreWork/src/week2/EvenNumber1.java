package week2;

import java.util.Scanner;

public class EvenNumber1 {

	public static void main(String[] args) {
		 
		int a;
		Scanner sc = new Scanner(System.in); {
			a = sc.nextInt();
//to stop the scanner from getting input and reduce the memory consumption			
			sc.close();
		}
		 //b=a/2  if the remainder is 0,it'll print even,else it'll print odd.		 
	     String b =a%2==0?"even":"odd";
	     System.out.println(b);	
	}

	}


