//Constructor and Destructor in Java Implementation
import java.util.*;
public class assignment_6 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		int area_rec = rectangle.area();
		rectangle = null;
		System.gc();
		System.out.println("Area of the Rectangle : " + area_rec + " sq. units.");
	}
}
class Rectangle
{
	int length, width;
	//Creating a Java Constructor
	public Rectangle(int a, int b) 
	{
		length = a;
		width = b;
	}
	int area() 
	{
		return length * width;
	}
	//Finalize Method
	protected void finalize()
	{
		System.out.println("Object is destroyed by the Garbage Collector.");
	}
}