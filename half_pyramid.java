public class half_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j <= i)
				{
					System.out.print("*\t");
				}
			}
			System.out.print("\n");
		}
	}
}