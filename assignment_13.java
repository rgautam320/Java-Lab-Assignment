import java.util.Scanner;
public class assignment_13 {
	public static void main(String[] args) 
	{
		// To run the code infinite times, while(true) has been used.
		while(true)
		{
			int a;
			System.out.println("<-- Factorial of a Number -->");
			Scanner scanner = new Scanner(System.in);
			
			// Exception Handling 
			try 
			{
				System.out.print("Enter a Number : ");
				a = scanner.nextInt();
				long result = factorial(a);
				System.out.println(a + "! = " + result);
			} 
			catch (Exception e) {
				System.out.println("Enter a proper integer value only");
			}
			System.out.println("------------------------------");
		}
	}
	// This function returns the factorial using recursion 
 	public static long factorial(int a)
	{
 		if(a >= 1)
 		{
 			return a * factorial(a-1);
		}
 		else 
 		{
			return 1;
 		}	
	}
}