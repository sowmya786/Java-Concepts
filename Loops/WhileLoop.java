package Loops;


public class WhileLoop {

	// static variable for memory management
	static int num = 1;

	public static void main(String[] args) {
		// using while loop
		while (num <= 20)

		{
			System.out.println(num++);
		}

		// Using for loop
		for (int number = 1; number <= 20; number++) {
			System.out.println(number);
		}

	}
}
