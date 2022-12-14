package week2;

public class Shift {

	int a;
	int b;
	int c;
      
	byte LeftShift() {
	
	   b=(a<<2);
	   return (byte)b;
	}
	
	byte RightShift() {
		
		b=(a>>2);
		return (byte)c;
		
	}
	public static void main(String[] args) {
	    
       Shift S = new Shift();
     
       S.a = 40;
     
       System.out.println(S.RightShift());

	}

}
