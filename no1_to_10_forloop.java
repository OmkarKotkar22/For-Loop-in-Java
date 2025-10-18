public class no1_to_10_forloop
{
	public static void main(String x[])
	{
		boolean flag = true;
		int num = 1;

		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if((j <= 3 + i) && (j >= 5 - i) && flag)
				{
					System.out.print(num);
					num++;
					flag = false;
				}
				else
				{
					System.out.print(" ");
					flag = true;
				}
			}
		System.out.print("\n");

		}
	}
}