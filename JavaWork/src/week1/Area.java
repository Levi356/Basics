package week1;

public class Area {
      
	double r;
	
	final double pi = 3.14;

      Area(double r){
    	  
    	 this.r =r; 	
	}
      
	double Circl() {
		
		return pi*r*r;	
	}
	
     public static void main(String [] args) {
    	 
    	 Area a = new Area((double)2);
    	 System.out.println(a.Circl());
     }
}
 
