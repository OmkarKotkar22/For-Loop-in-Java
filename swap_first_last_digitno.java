//13. Write a java program to swap first and last digits of a number

import java.util.Scanner;
public class swap_first_last_digitno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no = sc.nextInt();

		int count = 0, temp = no;
		while(no != 0)
		{
			count++;
			no = no / 10;
		}
		
		no = temp;
		int lastdigit = temp % 10;

		int p = (int)(Math.pow(10, count-1));

		int firstdigit = temp;

		for(; firstdigit >= 10; firstdigit = firstdigit / p)
		{
			no = no % p;
			no = no / 10;
			int lastdigit = lastdigit * p;
		}
		no = no * 10;
		 
		int swap = lastdigit + no + firstdigit;
		System.out.println(swap);
		//System.out.println(third);
		//System.out.println(firstdigit);
	}
}