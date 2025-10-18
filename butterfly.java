/*public class butterfly
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i >= j && i <= 5)
				{
					System.out.print("*");
				}
				else if(j <= 11 - i && i > 5)
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
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i >= j && i <= 5)
				{
					System.out.print("*");
				}
				else if(j <= 10 - i && i > 5)
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
}*/

public class butterfly 
{
	public static void main(String[] args) 
	{
        	// Upper half
        	for (int i = 1; i <= 5; i++) 
		{
        	    // Left stars
       	    		for (int j = 1; j <= i; j++) 
			{
                		System.out.print("* ");
            		}
            	   // Middle spaces
            		for (int j = 1; j <= 2 * (5 - i); j++) 
			{
            	    		System.out.print("  "); // Two spaces for alignment
            		}
                  // Right stars
            		for (int j = 1; j <= i; j++) 
			{
                		System.out.print("* ");
            		}
            		System.out.println();
        	}

        	// Lower half
        	for (int i = 5; i >= 1; i--) 
		{
        		// Left stars
            		for (int j = 1; j <= i; j++) 
			{
                		System.out.print("* ");
            		}
            		// Middle spaces
            		for (int j = 1; j <= 2 * (5 - i); j++) 
			{
                		System.out.print("  ");
            		}
            		// Right stars
            		for (int j = 1; j <= i; j++) 
			{
                		System.out.print("* ");
            		}
            	System.out.println();
        	}
    	}
}
