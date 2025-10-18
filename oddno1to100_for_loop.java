//5. Write a java program to print all odd number between 1 to 100

import java.util.Scanner;
public class oddno1to100_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				if(j % 2 != 0)
				{
					System.out.println("Odd Numbers: " + j);
				}
			}
		}
	}
}