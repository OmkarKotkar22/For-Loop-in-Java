public class number_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <=7; j++)
			{
				if(j >= 5 - i && j <= 3 + i)
				{
					System.out.print(i +"\t");
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