public class hollow_inverted_half_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <=6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				if(j == 1 || i == 1 || j == 7-i)
				{
					System.out.print("*\t");
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