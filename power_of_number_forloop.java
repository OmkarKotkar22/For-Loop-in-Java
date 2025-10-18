import java.util.Scanner;
public class power_of_number_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = sc.nextInt();

		System.out.println("Enter the index: ");
		int index = sc.nextInt();

		int p = 1;
		for(; index != 0;)
		{
			p = p * base;
			--index;
		}
		System.out.println(p);
	}
}