package week2;

public class Polymorphism {
     
	void Area(int length,int breath) {
		System.out.println("Area of rectangle : " + (length*breath));
	}
    void Area(int length,int breath,int height) {
    	System.out.println( "Area of cuboid : "+((2*(length*breath))+(2*(length*height))+(2*(height*breath))));
    }

 public static void main(String [] args) {
       
	 Polymorphism P = new Polymorphism();
	 
	 P.Area(5,10);
	 P.Area(5,10,20);
 }
}