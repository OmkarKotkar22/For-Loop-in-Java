public class one_side_A_Z_pyramid
{
	public static void main(String x[])
	{
		int k = 65;
		for(int i = 1; i <= 5; i++)
		{
			boolean flag = true;
			for(int j = 1; j <= 9; j++)
			{
				if((i * 2 - 1)>=j && flag)
				{
					System.out.print((char)(k));
					k += 1;
					flag = false;
				}
				else
				{
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println( );
			
		}
		
	}
}