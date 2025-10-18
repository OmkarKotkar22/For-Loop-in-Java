import java.util.Scanner;
public class Armstrongno1_to_n_forloop 
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		// loop from 1 to n
		for (int i = 1; i <= no; i++) 
		{
			int temp = i;
			int count = 0;

			// Step 1: count digits
			int t = temp;
			while (t != 0) 
			{
				count++;
				t = t / 10;
			}

			// Step 2: calculate Armstrong sum
			int sum = 0;
			t = temp;
			while (t != 0) 
			{
				int rem = t % 10;
				int power = 1;

				// brute force power calculation (rem^count)
				for (int j = 1; j <= count; j++) 
				{
					power = power * rem;
				}

				sum = sum + power;
				t = t / 10;
			}

			// Step 3: check condition
			if (sum == temp) 
			{
				System.out.println(temp + " is an Armstrong number");
			}
		}
	}
}
