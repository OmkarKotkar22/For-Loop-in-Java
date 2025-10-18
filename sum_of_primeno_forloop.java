import java.util.Scanner;
public class sum_of_primeno_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int total = 0;
		for(int num = 2; num <= no; num++)
		{
			Boolean flag = true;
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				total = total + num;
			}
		}
		System.out.println("Sum of Prime No: " + total); 
	}
}