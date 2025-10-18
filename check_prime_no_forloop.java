import java.util.Scanner;
public class check_prime_no_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		boolean flag = true;
		
		if(no <= 1)
		{
			flag = false;
		}
		else
		{
			for(int i = 2; i < no; i++)
			{
				if(no % i == 0)
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}