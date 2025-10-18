//4. Write a java program to print all even numbers between 1 to 100. - using for loop

import java.util.Scanner;
public class evenno1to100_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();

		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				if(j % 2 == 0)
				{
					System.out.println("Even Number: " + j);
				}
			}
		}
	}
}