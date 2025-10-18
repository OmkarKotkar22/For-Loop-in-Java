import java.util.Scanner;
public class freq_of_digit_forloop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		
		int j = no;
		for(int i = 0; i <= 9; i++)
		{
			int temp = j,  count = 0;
			while(temp > 0)
			{
				int rem = temp % 10;
				if(rem == i)
				{
					count++;
				}
			temp = temp / 10;
			}
			if(count > 0)
			{
				System.out.println("Digit " + i + " occurs " + count + " time(s)");
			}
		}
	}
}