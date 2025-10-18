public class halfdiamond_star_number
{
	public static void main(String x[])
	{	
		//boolean flag = true;
		for(int i = 1; i <= 8; i++)
		{
			//System.out.print("*");
			for(int j = 1; j <= 7; j++)
			{
				if(j <= i && i <= 4)
				{
					System.out.print(i);
					if(j != i)
					{
						System.out.print("*");;
					}
				}
				else if(j < (17 - 2 * i) && i > 4)
				{
					if(j % 2 == 0)
						System.out.print("*");

					else
					{
						System.out.print(8 - i);
					}
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