public class half_half_number_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if((5 - i + 1) <= j)
				{
					System.out.print((char)(j+64);
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			/*for(int j = 5; j >= 1; j--)
			{
				if(j <= i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}*/
			System.out.println("\n");
		}
	}
}