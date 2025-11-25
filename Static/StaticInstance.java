package Static;

public class StaticInstance {

	// static variables
	static int a = 10;
	static int b = 20;

	// Instance variables
	int c = 30;
	int d = 40;

	// 2. Print instance variables in static methods
	// we can't access instance variables and methods in static
	// to access we should create an object.
	static void staticMethod1() {
		StaticInstance ref = new StaticInstance();
		int sum = ref.c + ref.d;
		System.out.println(sum);
	}

	// 3. Print static variables in Instance methods
	void instanceMethod1() {
		int sub = a - b;
		System.out.println(sub);
	}

	// 4. Call instance methods in static methods
	// we can't access instance variables and methods in static
	// to access we should create an object.
	static void staticMethod2() {
		StaticInstance ref = new StaticInstance();
		ref.instanceMethod1();
	}

	// 5. Call static methods in instance methods
	void InstanceMethod2() {
		staticMethod1();
	}

	public static void main(String[] args) {

		StaticInstance ref = new StaticInstance();

		// 6. Print all the static, instance variables in main method
		System.out.println("static variables:" + a + "," + b);
		System.out.println("Instance variables:" + ref.c + "," + ref.d);

		// 7. Call static methods and instance methods in main method

		staticMethod1();
		staticMethod2();

		ref.instanceMethod1();
		ref.InstanceMethod2();

	}

}
