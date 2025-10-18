//12. Write a C program to find sum of first and last digit of a number

import java.util.Scanner;
public class sumof_first_last_digitno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no = sc.nextInt();

		int lastdigit = no % 10;
		int firstdigit = no;

		while(firstdigit >= 10)
		{
			firstdigit = firstdigit / 10;
		}
		int sum = firstdigit + lastdigit;
		System.out.println("sum of first and last digit of a number: " +sum); 
	}
}