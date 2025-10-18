public class half_number_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <=5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j <= i)
				System.out.print(j + " \t");
			}
			System.out.print("\n");
		}
	}
}