public class assignment_9 
{
	public static void main(String[] args) 
	{
		int resultInt = addMethod(5, 15);
		double resultDouble = addMethod(2.5, 5.4);
		System.out.println("Int: " + resultInt);
		System.out.println("Double: " + resultDouble);
	}
	//Here we are defining two methods named addMethod for both integer and double
	static int addMethod(int x, int y)
	{
		return x + y;
	}
	static double addMethod(double x, double y)
	{
		return x + y;
	}
}
