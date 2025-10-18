import java.util.Scanner;
public class hcf_of_twono_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the number 2: ");
		int no2 = sc.nextInt();

		int min;
		if(no1 < no2)
		{
			min = no1;
		}
		else
		{
			min = no2;
		}
		int hcf = 1;
		for(int i = 1; i <= min; i++)
		{
			if((no1 % i == 0) && (no2 % i == 0))
			{
				hcf = i;
			}
		}
		System.out.println("HCF of both number is :" + hcf);
	}
}