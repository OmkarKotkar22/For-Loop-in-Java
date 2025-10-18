//11. Write a java program to find first and last digit of a number.


import java.util.Scanner;

public class first_last_digit_for_loop
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		int lastdigit = num % 10;
		int firstdigit = num;

		// Using for loop to extract the first digit
		for(; firstdigit >= 10; firstdigit = firstdigit / 10) {
			// keeps dividing until only the first digit remains
		}

		System.out.println("First Digit: " + firstdigit);
		System.out.println("Last Digit: " + lastdigit);
	}
}
