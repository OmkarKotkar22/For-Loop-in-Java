public class Diagonal_Sidesof_Rhombus
{
	public static void main(String x[])
	{
		Boolean flag = true;
		for(int i=1; i<=5; i++)
		{
	       		for(int j=1; j<=9; j++)
			{
				if(j==6-i || j==4+i  && flag)
			   	{ 
					System.out.printf("*");
		          		flag=false;
			   	}
				else if(j == 5)
				{
					System.out.print("*");
					flag = true;
				}
			   	else
			   	{ 
					System.out.printf(" ");
		         		flag=true;
			   	}
			}
			System.out.printf("\n"); 
		}
		for(int i=5; i>=1;i--)
		{
	       		for(int j=1; j<=9; j++)
			{
				if(j==6-i || j==4+i && flag)
			   	{ 
					System.out.printf("*");
		          		flag=false;
			   	}
				else if(i == 5 || j == 5)
				{
					System.out.print("*");
					flag = true;
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