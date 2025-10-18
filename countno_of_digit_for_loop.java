//10. Write a C program to count number of digits in a number.

import java.util.Scanner;
public class countno_of_digit_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int rem = 0, count = 0;
		for(int i = 1; i<= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				rem = no % 10;
				if(rem != 0)
				{
					count++;
				}
				no = no / 10;
			}
		}
		System.out.println("count number of digits in a number: " + count);
	}
}