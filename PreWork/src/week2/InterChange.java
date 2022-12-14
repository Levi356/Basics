package week2;

public class InterChange {

	public static void main(String[] args) {
	   int a = 1000;
	   int b = 2020;
// the value of a is changed to 100+20=120.   
     a=a+b;
// the value of b is changed to  120-20=100.   
     b=a-b;
// the value of a is changed to  120-100=20.    
     a=a-b;
// thus the values are swapped     
     System.out.println(a);
     System.out.println(b);
     
	}

}
