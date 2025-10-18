public class left_arrow
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 8; j++)
			{
				if(j == 5 - i || i == 5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(int i = 4; i >= 1; i--)
		{
			for(int j = 1; j <= 8; j++)
			{
				if(j == 5 - i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}
}
