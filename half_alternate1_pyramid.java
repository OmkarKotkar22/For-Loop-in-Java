public class half_alternate1_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j +"\t");
			}
			for(int k = i - 1; k >= 1; k--)
			{
				System.out.print(k +"\t");
			}
		System.out.print("\n");
		}
	}
}