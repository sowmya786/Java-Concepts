package Loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int flag = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		a = s.nextInt();

		for (int i = 2; i <= a / 2; ++i) {
			if (a % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(a + " is a Prime Number");
		} else {
			System.out.println(a + " is not a Prime Number");
		}

	}
}