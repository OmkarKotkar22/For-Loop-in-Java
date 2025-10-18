public class inverted_star_pyramid
{   
	public static void main(String x[])
    	{  
		for(int i=6; i>=1;i--)
		{
			boolean flag=true;
	       		for(int j=1; j<=11; j++)
			{
				if(j >= 7-i && j <= 5+i && flag)
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
