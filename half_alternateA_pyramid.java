public class half_alternateA_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char)(j+64) +"\t");
			}
			for(int k = i - 1; k >= 1; k--)
			{
				System.out.print((char)(k+64) +"\t");
			}
		System.out.print("\n");
		}
	}
}