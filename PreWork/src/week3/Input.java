package week3;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		  byte    a ;
		  short   b ;
		  int      c ;
		  long    d ;
	      float   e ;
		  double  f ;
		  char    g ;
	      boolean h ;
//getting input	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a byte value"); 
	      a=sc.nextByte();
	      System.out.println("Enter a short value");
	      b=sc.nextShort();
	      System.out.println("Enter a int value");
	      c=sc.nextInt();
	      System.out.println("Enter a long value"); 
	      d=sc.nextLong();
	      System.out.println("Enter a float value");
	      e=sc.nextFloat();
	      System.out.println("Enter a double value"); 
	      f=sc.nextDouble();
	      System.out.println("Enter a char value"); 
	      g=sc.next().charAt(0);
	      System.out.println("Enter a boolean value"); 
	      h=sc.nextBoolean();
	      sc.close();
//printing values	
	      
	System.out.println("Byte      -> " +a);
	System.out.println("Short     -> " +b);
	System.out.println("Int       -> " +c);
	System.out.println("Long      -> " +d);
	System.out.println("FLoat     -> " +e);
	System.out.println("Double    -> " +f);
	System.out.println("Character -> " +g);
	System.out.println("Boolean   -> " +h);

	}

}
