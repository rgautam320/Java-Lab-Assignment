import java.util.*;
public class assignment_2 {

	public static void main(String[] args) {
		//We are reversing the user input string in three ways
		while(true)
		{
			int choice;
			String str;
			System.out.println("Different Ways :");
			System.out.println("1. Using StringBuilder");
			System.out.println("2. Using String Concatenation");
			System.out.println("3. Using Character Array");
			System.out.println("4. Exit");
			System.out.print("Choose a way : ");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			System.out.print("Enter a String : ");
			Scanner scanner2 = new Scanner(System.in);
			str = scanner.nextLine();
			//Switch statement has used to perform the reverse action by different methods
			switch (choice) {
			case 1: 
			{
				str = reverse1(str);
				System.out.println("The reverse string is : " + str);
				System.out.println("");
				break;
			}
			case 2:
			{
				str = reverse2(str);
				System.out.println("The reverse string is : " + str);
				System.out.println("");
				break;
			}
			case 3:
			{
				str = reverse3(str);
				System.out.println("The reverse string is : " + str);
				System.out.println("");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	//Different methods have defined to reverse the string
	public static String reverse1(String str)
	{
		return new StringBuilder(str).reverse().toString();
	}
	public static String reverse2(String str)
	{
		String rev = "";
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	public static String reverse3(String str)
	{
		char[] temp = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			temp[str.length()-i-1] = str.charAt(i);
		}
		return String.copyValueOf(temp);
	}
}

