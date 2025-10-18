public class diagonal_and_sidesof_rectangle
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if(i == 1 || i == 7 || j == 1 || j == 7)
				{
					System.out.print("*");
				}
				else if((i == 2 && j == 2) || (i == 2 && j == 6))
				{
					System.out.print("*");
				}
				else if((i == 3 && j == 3) || (i == 3 && j == 5))
				{
					System.out.print("*");
				}
				else if(i == 4 && j == 4)
				{
					System.out.print("*");
				}
				else if((i == 5 && j == 3) || (i == 5 && j == 5))
				{
					System.out.print("*");
				}
				else if((i == 6 && j == 2) || (i == 6 && j == 6))
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