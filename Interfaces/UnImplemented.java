/* 2. Create an interface with two methods, but implement only one in a class.
Call the method implemented.
3. use interface instances to call the implemented method in the implemented class.
4.Create two interfaces with one method each. Implement these two interfaces 
in one class.
5. Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.
6. Create an interface with a default method and implement it in a class. 
Do not provide implementation to the default method and call the method.
7. Create an interface and inherit it from the other interface.*/

package Interfaces;

interface SearchcontextOne {
	void findElement();

	void findElements();

	void duplicateMethod(); // same method (same signature) in both the interfaces.
}

interface WebDriver extends SearchcontextOne {

	void get();

	void duplicateMethod(); // same method (same signature) in both the interfaces.

	default void defaultMethod() // default method
	{
		System.out.println("This is a default method");
	}
}

// we have to implement all the methods if not we should make the class as abstract

class Implemented implements SearchcontextOne, WebDriver {
	public void findElement() {
		System.out.println("Findelements is the method of searchcontext");
	}

	public void findElements() {
		System.out.println("Findelements is the method of searchcontext");

	}

	public void get() {
		System.out.println("method in webdriver");
	}

	public void duplicateMethod() {
		System.out.println("This method is duplicate");
	}

	public static void main(String[] args) {
		Implemented im = new Implemented();
		im.findElement();
		im.findElements();
		im.get();
		im.duplicateMethod();
		im.defaultMethod();

	}

}
