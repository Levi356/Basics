package week1;

public class StaticFinalDemo {

    static int var1 = 10;
    static int var2 = 1;

	void Method1() {
	  
      var1++;  
      System.out.println(var1);
	}
	void Method2(){
	   var2++;
	   System.out.println(var2);  
	}
	          
	public static void main(String[] args) {
		
		StaticFinalDemo a = new StaticFinalDemo();
		StaticFinalDemo b = new StaticFinalDemo();
		StaticFinalDemo c = new StaticFinalDemo();
	
		a.Method1();
	    b.Method1();      
	    c.Method1();
	    
	    a.Method2();
	    b.Method2();
	    c.Method2();
	
	
	
	}
	}