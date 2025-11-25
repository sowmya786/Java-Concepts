package Loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		a = s.nextInt();

		// int a = 20; //assign a value so it fails test condition

		do {
			
			System.out.println("value of i=" + a);
			a++;
		}

		while (a < 20);
	}
}
	

