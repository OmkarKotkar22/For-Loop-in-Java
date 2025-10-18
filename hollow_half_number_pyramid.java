public class hollow_half_number_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j == 1 || i == j || i == 5)
				{
					System.out.print(j + "\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			System.out.print("\n");
		}
	}
}