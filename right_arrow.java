public class right_arrow
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 8; j++)
			{
				if (j == i + 3 || i == 5) 
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
		for(int i = 8; i >= 5; i--)
		{
			for(int j = 1; j <= 8; j++)
			{
				if (j == i - 1) 
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