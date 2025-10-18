import java.util.Scanner;
public class all_ascii_char_values_forloop
{
	public static void main(String x[])
	{
		//System.out.println("Enter the character:");

		for(int i = 0; i <= 127; i++)
		{
			System.out.println(i + "\t\t " +(char)i);
		}
	}
}