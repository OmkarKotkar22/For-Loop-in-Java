public class rhombus
{
	public static void main(String x[])
	{
		int n = 4;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if((j >= 5 - i) && (j <= 8 - i))
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