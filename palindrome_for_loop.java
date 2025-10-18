//17. Write a C program to check whether a number is palindrome or not.

import java.util.Scanner;
public class palindrome_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no = sc.nextInt();
		int p = 0, ld = 1;
		for(; no > 0; )
		{
			ld = no % 10;
			p = p * 10 + ld;
			no = no / 10;
		}
		System.out.println("number is palindrome:" + p);
	}
}