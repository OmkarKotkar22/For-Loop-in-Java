import java.util.Scanner;
public class prime_no_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		for(int num = 2; num <= no; num++)
		{
			Boolean flag = true;
			for(int i = 2; i < num; i++)
			{
				if(num % 2 == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("num"+ num);
		}
	}
}