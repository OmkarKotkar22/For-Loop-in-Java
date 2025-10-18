//16. Write a C program to enter a number and print its reverse.

import java.util.Scanner;
public class reverse_no_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();

		int rev = 0, rem = 0;
		for(;no != 0;)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reverse:" + rev);
	}
}