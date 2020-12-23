import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		System.out.println("Exception Handling Program");
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a Number to find its square: ");
			int n = scanner.nextInt();
			System.out.println("Square: " + n * n);
		} catch (ArithmeticException e) {
			System.out.println("Please enter a proper Number");
		}
		scanner.close();
	}
}
