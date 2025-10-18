public class full_pyramid
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(j>=6-i && j<=4+i)
			   	{ 
					//System.out.printf(i + "\t");
		          		if(j < 5)
					{
						System.out.print(i);
						i++;
					}
					else if(j == 5)
					{
						System.out.print(i);
					}
					else
					{
						i--;
						System.out.print(i);
					}
			   	}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}
}