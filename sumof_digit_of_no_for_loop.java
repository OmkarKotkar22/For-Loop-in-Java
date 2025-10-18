//14. Write a C program to calculate sum of digits of a number

import java.util.Scanner;
public class sumof_digit_of_no_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int rem =0, sum = 0;
		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				rem = no % 10;
				if(rem != 0)
				{
					sum = sum + rem;
				}
				no = no / 10;
			}
			
		}
		System.out.println("sum of digits of a number: " + sum);
	}
}