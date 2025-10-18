//6. Write a C program to find sum of all natural numbers between 1 to n.

import java.util.Scanner;
public class sumof_naturalno_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				sum = sum + j;
			}
		}
		System.out.println("Sum of Natural Numbers: " + sum);

	}
}