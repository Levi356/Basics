package week2;

public class InheritanceA {

	final float pi = 22 / 7;
	public float radius, result;
	public void circleArea(float rad) 
	{
		radius = rad;
		result = pi * radius * radius;
		System.out.println("The area of the circle is: "+ result + " cm");
}
}
