package week1;

public class ConstructorDemo {

	 private int Integer;
     private float Float;
     private String String;
     private char Character; 

    public ConstructorDemo() { 

      System.out.println("I'm a default constructor");
    }

    public ConstructorDemo(int Integer,float Float,String String,char Character) {

       this.Integer = Integer;
       this.Float = Float ;
       this.String =String;
       this.Character=Character;
      System.out.println("I am Parameterized constructor with arguments as input");
    }

    public void observations(){ 

    System.out.println("inside Observations method");

   }

public static void main(String[] args) {

     ConstructorDemo C = new ConstructorDemo(2,(float) 0.3,"Demo",'B');
     
     System.out.println((C.Integer)*(C.Integer));
     System.out.println((C.Float)*(C.Float));
     System.out.println(C.String);
     System.out.println(C.Character);
  
        
  }
}

