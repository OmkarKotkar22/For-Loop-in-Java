public class solidhalfdiamond_number_star 
{
	public static void main(String x[]) 
	{
        	int rows = 4;
	
        	// Upper part (1 to 4)
        	for(int i = 1; i <= rows; i++) 
		{
        		for(int j = 1; j <= i; j++) 
			{
                		System.out.print(i);
                		if(j < i)
				{
                			System.out.print("*");
                		}
            		}
            		System.out.println();
        	}	

        	// Lower part (4 to 1)
        	for(int i = rows; i >= 1; i--) 
		{
        		for(int j = 1; j <= i; j++) 
			{
                		System.out.print(i);
                		if(j < i) 
				{
                			System.out.print("*");
                		}
            		}
            		System.out.println();
        	}
	}
}
