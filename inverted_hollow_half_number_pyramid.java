public class inverted_hollow_half_number_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j < 5; j++)
			{
				if((i == 1) && (j != 1))
				{
					System.out.print(j + " ");
				}
				if((j == 1))
				{
					System.out.print(i);
				}
				if((i != 5) && (j == 6 - i))
				{
					System.out.print(5);
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
	}
}