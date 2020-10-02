import java.util.*;
public class assignment_5 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			int x, y;
			System.out.println("Enter Two Numbers to Perform Operations : ");
			Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			y = scanner.nextInt();
			//Creating 'operation1' as the object of Calculation
			Calculation operation1 = new Calculation();
			operation1.addition(x, y);
			operation1.subtraction(x, y);
			//Creating 'operation2' as the object of Calculation
			mycalculation operation2 = new mycalculation();
			operation2.multiplication(x, y);
			operation2.division(x, y);
			operation2.modulus(x, y);
			System.out.println("-------------------------------");
		}
	}
}
class Calculation
{
	public void addition(int x, int y)
	{
		int result = x + y;
		System.out.println("Addition : " + result);
	}
	public void subtraction(int x, int y)
	{
		int result = x - y;
		System.out.println("Substraction : " + result);
	}
}
class mycalculation extends Calculation
{
	public void multiplication(int x, int y)
	{
		int result = x * y;
		System.out.println("Multiplication : " + result);
	}
	public void division(int x, int y)
	{
		int result = x / y;
		System.out.println("Division : " + result);
	}
	public void modulus(int x, int y)
	{
		int result = x % y;
		System.out.println("Modulus : " + result);
	}
}