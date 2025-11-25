/* 5. Write a program to print largest number among three numbers*/
/* 13. Write a program to print largest number among three numbers*/

package Loops;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		//int a = 10;
		//int b = 20;
		//int c = 30;

		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		a = s.nextInt();
		System.out.print("Enter the second number:");
		b = s.nextInt();
		System.out.print("Enter the third number:");
		c = s.nextInt();

		// comparing numbers, a with b and a with c
		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");

		// comparing b with a and b with c
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");

		else

			// prints c if the above conditions are false
			System.out.println(c + " is the largest number");
	}

}


