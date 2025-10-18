import java.util.Scanner;
public class factor_of_no_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		for(int i = 1; i <= no; i++)
		{
			if(no % i == 0)
			{
				System.out.println("factors of the number: " + i);
			}
		}
	}
}