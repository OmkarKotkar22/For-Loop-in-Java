public class number_inside_star_pattern
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 17; j++)
			{
				if(j >= 9 - i && j <= 8 + i)
				{
					if(i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print("*");
					}
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}