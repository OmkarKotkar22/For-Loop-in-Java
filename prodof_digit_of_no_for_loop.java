//15. Write a java program to calculate product of digits of a number.

import java.util.Scanner;
public class prodof_digit_of_no_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int rem = 0, prod = 1;
		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				rem = no % 10;
				
				if(rem != 0)
				{
					prod = prod * rem;
				}
				no = no / 10;
			}
		}
		System.out.println("product of digits of a number:" + prod);
	}
}