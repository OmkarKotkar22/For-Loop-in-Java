public class number_half_diamond
{
	public static void main(String x[])
	{
		for(int i = 1; i <=7; i++)
		{
			for(int j = 1; j <=4; j++)
			{
				if(i >= j && i <= 4)
				{
					System.out.print(i + 2);
				}
				else if(j <= 8 - i && i > 4)
				{
					System.out.print(10 - i);
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