import java.util.*;
public class assignment_3 {

	public static void main(String[] args) {
		while(true)
		{
			int n, index_buy, index_sell, result;

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the length of Array : ");
			n = scanner.nextInt();
			int [] Array = new int[n];
			
			System.out.println("Enter the values in the Array : ");
			for(int i = 0; i < n; i++)
			{
				Array[i] = scanner.nextInt();
			}
			System.out.print("[");
			for(int i: Array)
			{
				System.out.print(" " + i + " ");
			}
			System.out.println("]");
			
			System.out.println("Index of Buying price : ");
			index_buy = scanner.nextInt()-1;
			System.out.println("Index of Selling price : ");
			index_sell = scanner.nextInt()-1;
			
			result = Array[index_sell] - Array[index_buy];
			
			if(index_sell > index_buy)
			{
				if(result > 0)
				{
					System.out.println("Maximun Profit : " + result);
				}
				else if(result == 0)
				{
					System.out.println("There is no loss or profit.");
				}
				else 
				{
					System.out.println("Maximun Loss : " + result);
				}
			}
			else 
			{
				System.out.println("You can't sell at the past price.");
			}
			System.out.println("------------------------------");
		}
	}
}
