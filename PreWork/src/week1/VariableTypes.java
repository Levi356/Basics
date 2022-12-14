package week1;



public class VariableTypes {
       
// java only accepts static global variables
	// global variables are the variables in the top declared before the main method
	 static byte    a = 1;
	 static short   b = 2;
	 static int     c = 3;
	 static long    d = 4;
// as default java take decimal values as double so we need to type cast mention that we declare an float by adding (float)	 
	 static float   e = (float) 5.0;
	 static double  f = 6.0;
	 static char A;
	 static char    g = A;
     static boolean h = true;
 	public static void main(String[] args) {
 
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);

	}
}