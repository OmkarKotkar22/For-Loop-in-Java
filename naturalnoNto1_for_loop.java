//2. Write a java program to print all natural numbers in reverse (from n to 1). - using for loop

import java.util.Scanner;
public class naturalnoNto1_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		for(int i = no; i >= 0; i--)
		{
			for(int j = i; j <= i; j++)
			{
				System.out.println("Reverse Natural no: " + j);
			}
		}

	}
}
