//3. Write a java program to print all alphabets from a to z. - using for loop

import java.util.Scanner;
public class alphabetatoz_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charcter:");
		char ch = sc.next().charAt(0);

		for(char i='a'; i <= ch; i++)
		{
			for(char j = i; j <=i; j++)
			{
				if(ch >= 'a' && ch <='z')
					System.out.println("Alphabet: " + i);
			}
		}
	}
}