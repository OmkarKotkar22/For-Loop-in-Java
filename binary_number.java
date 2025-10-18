public class binary_number
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j % 2 != 0 && j <= i)
				{
					System.out.print("0");
				}
				else if(j % 2 == 0 && j <= i)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j = 6; j <= 10; j++)
			{
				if(j % 2 != 0 && j <= i)
				{
					System.out.print("0");
				}
				else if(j % 2 == 0 && j <= i)
				{
					System.out.print("1");
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