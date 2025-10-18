//8. Write a java program to find sum of all odd numbers between 1 to n
import java.util.Scanner;
public class sumof_oddno1toN_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= no; i++)
		{
			for(int j = i; j <= i; j++)
			{
				if(j % 2 != 0)
				{
					sum = sum + j;
				}
			}
		}
		System.out.println("Sum of Odd No :" + sum);
	}
}