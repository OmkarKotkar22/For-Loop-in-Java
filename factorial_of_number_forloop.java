import java.util.Scanner;
public class factorial_of_number_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int factorial = 1;
		for(int i =1; i <= no; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of number: " + factorial);
	}
}