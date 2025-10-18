public class solid_diamond
{
	public static void main(String x[])
	{
		Boolean flag = true;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(j >= 6 - i && j <= 4 + i && flag)
				{
					System.out.print("*");
					flag = false;
				}
				
				else
				{
					flag = true;
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(int i=5; i>=1;i--)
		{
			flag=true;
	       		for(int j=1; j<=9; j++)
			{
				if(j >= 6-i && j <= 4+i && flag)
			   	{ 
					System.out.printf("*");
		          		flag=false;
			   	}
			   	else
			   	{ 
					System.out.printf(" ");
		         		flag=true;
			   	}
			}
			System.out.printf("\n");
		}
	}
}