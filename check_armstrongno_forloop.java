import java.util.Scanner;
public class check_armstrongno_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int temp = no, count = 0 , sum = 0;
		while(no != 0)
		{
			count++;
			no = no / 10;
		}
	
		no = temp;

		while(no != 0)
		{
			int rem = no % 10;
			no = no / 10;
			
			int p = 1;
			for(int j = 1; j <= count; j++)
			{
				p = p * rem;
			}
			sum = sum + p;
		}
		String str = (sum == temp) ? "Armstrong no" : "Not Armstrong no";
		System.out.println(str);
	}
}