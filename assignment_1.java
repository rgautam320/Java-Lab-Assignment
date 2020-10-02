import java.util.*;

public class assignment_1 {
	public static void main(String[] args) 
	{
		//We are executing this while loop infinite times
		while(true)
		{
			int choice;
			System.out.println("Choose what you want to Implement :");
			System.out.println("1. If Else");
			System.out.println("2. For Loop");
			System.out.println("3. While Loop");
			System.out.println("4. Do While Loop");
			System.out.println("5. Break");
			System.out.println("6. Continue");
			System.out.println("7. Switch");
			System.out.println("8. Exit");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
			//Using switch statement, we will be able to choose our desire action
			switch (choice) {
			case 1: 
			{
				if_else();
				break;
			}
			case 2:
			{
				for_loop();
				break;
			}
			case 3:
			{
				while_loop();
				break;
			}
			case 4:
			{
				do_while_loop();
				break;
			}
			case 5:
			{
				break_statement();
				break;
			}
			case 6:
			{
				continue_statement();
				break;
			}
			case 7:
			{
				switch_statement();
				break;
			}
			case 8:
			{
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	//Different methods have defined as per our requirement
	static void if_else()
	{
		int hrs;
		System.out.println("<--For the Time System-->");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hour in 24 hrs format : ");
		hrs = scanner.nextInt();
		if (hrs <= 10 && hrs >= 6) 
		{
			System.out.println("Good Morning");
		}
		else if (hrs <= 18) 
		{
			System.out.println("Good Afternoon");
		}
		else if (hrs <= 22) 
		{
			System.out.println("Good Evening");
		}
		else 
		{
			System.out.println("Good Night");
		}
	}
	static void for_loop()
	{
		System.out.println("We are printing multiplication table using For Loop");
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = scanner.nextInt();
		System.out.println("Multiplication Table");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
	static void while_loop()
	{
		int i = 1, n;
		System.out.println("Printing Natural Number till N");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = scanner.nextInt();
		while(i <= n)
		{
			System.out.println(i);
			i++;
		}
	}
	static void do_while_loop()
	{
		int i = 1, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = scanner.nextInt();
		do 
		{
			//It will print 1 anyway
			System.out.println(i);
			i++;
		} 
		while (i <= n);
	}
	static void break_statement()
	{
		int i, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = scanner.nextInt();
		for(i = 0; i <= n; i++)
		{
			//It will get terminated if i = 6. 
			if(i == 6)
			{
				break;
			}
			System.out.println(i);
		}
	}
	static void continue_statement()
	{
		int i, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = scanner.nextInt();
		for(i = 0; i <= n; i++)
		{
			//It will skip i = 6 and print afterwards. 
			if(i == 6)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	static void switch_statement()
	{
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day your choice : ");
		choice = scanner.nextInt();
		switch (choice) {
		case 1: 
		{
			System.out.println("Monday");
			break;
		}
		case 2: 
		{
			System.out.println("Tuesday");
			break;
		}
		case 3: 
		{
			System.out.println("Wednesday");
			break;
		}
		case 4: 
		{
			System.out.println("Thursday");
			break;
		}
		case 5: 
		{
			System.out.println("Friday");
			break;
		}
		case 6: 
		{
			System.out.println("Saturday");
			break;
		}
		case 7: 
		{
			System.out.println("Monday");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
