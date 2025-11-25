package operators;

public class ArithmeticOperator {

	/*
	 * static variable - memory gets allocated only once at the time of class
	 * loading, and is mainly used for memory management
	 */

	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		// addition operator
		int sum = a + b;
		System.out.println("Sum is: " + sum);

		// Subtraction Operation
		int dif = a - b;
		System.out.println("Difference is : " + dif);

		// Multiplication Operation
		int mul = a * b;
		System.out.println("Multiplied value is : " + mul);

		// Division Operation
		int div = a / b;
		System.out.println("Quotient is : " + div);

		// Modulus Operation
		int rem = a % b;
		System.out.println("Remainder is : " + rem);

		// post increment operator
		System.out.println(a++);

		// pre increment operator
		System.out.println(++a);

		// post decrement operator
		System.out.println(a--);

		// pre decrement operator
		System.out.println(--a);

		if (a == b || a != b) {
			System.out.println(a + "is not equal to" + b);
		}

		else {
			System.out.println(a + "is equal to" + b);
		}
	}

}
