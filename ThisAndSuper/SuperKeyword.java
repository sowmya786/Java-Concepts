
/*2. Print the fields/instance members of the parent class using super
* 5. Call constructor of the parent class using super()
* 6.Use this() and super() in methods not in constructors */

package ThisAndSuper;

//SuperClass
class RemoteWebdriver {
	String a = "WebDriver";

	RemoteWebdriver() {
		System.out.println("This is parent class constructor");
	}

	// Using this() in methods
	void get() {
		System.out.println("Used this() in methods");
	}

	void sendKeys() {

		this.get();
	}
}

// SubClass
class ChromeDriver extends RemoteWebdriver {
	String a = "Java";

	ChromeDriver() {

		super();

		System.out.println("This is child class constructor");
	}

	void myMethod() {
		super.sendKeys();

		System.out.println("Used super() in methods");
		System.out.println(super.a + " is an interface ");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.myMethod();
	}
}
	

