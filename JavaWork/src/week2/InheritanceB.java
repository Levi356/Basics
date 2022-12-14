package week2;

public class InheritanceB extends InheritanceA {
	public float length, breadth, result;
	public void rectangleArea(int l, int b) 
	{
		length = l;
		breadth = b;
		result = length * breadth;
	System.out.println("The area of the rectangle is: " + result + " cmsquare");
}
}