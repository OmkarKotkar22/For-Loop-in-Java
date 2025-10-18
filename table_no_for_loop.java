//9. Write a java program to print multiplication table of any number.

import java.util.Scanner;
public class table_no_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		int prod = 1;
		for(int i = 1; i <= 10; i++)
		{
			prod = no * i;
			System.out.println("multiplication table of any number: " + prod);
		}
		
	}
}