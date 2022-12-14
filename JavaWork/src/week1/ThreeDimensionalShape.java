package week1;

public class ThreeDimensionalShape {
  
	double width,height,depth;
	
	ThreeDimensionalShape() {
         width=height=depth=0;
	}

	ThreeDimensionalShape(int length) {
     width=height=depth=length;
	}

	ThreeDimensionalShape(int width, int height, double depth) {
      this.width = width;
      this.height= height;
      this.depth = depth;
	}
    
	public double volume(){
		
		return (width*height*depth);
	}

public static void main(String args[]) 

{ 

   

 ThreeDimensionalShape shape1 = new ThreeDimensionalShape(5, 6, 7); 

 ThreeDimensionalShape shape2 = new ThreeDimensionalShape(); 

 ThreeDimensionalShape shape3 = new ThreeDimensionalShape(8); 



    double volume; 


    volume = shape1.volume(); 

    System.out.println(" Volume of shape1 is " + volume); 




    volume = shape2.volume(); 

    System.out.println(" Volume of shape2 is " + volume); 



    

    volume = shape3.volume(); 

    System.out.println(" Volume of shape3 is " + volume); 

} 

} 