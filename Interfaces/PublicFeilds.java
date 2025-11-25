/* 1. Create a PUBLIC interface with fields and methods, fields should
have values assigned Implement this interface to some class and print 
the values of the interface fields and call the interface methods
2. Create a PRIVATE or PROTECTED interface and print the values as above scenario.
3. Create an interface with private, public and protected fields.
4.Create an interface with static final variable*/

package Interfaces;

public interface PublicFeilds {
	int var = 10; // by default all the variables are public static final

	void Method(); // all the methods are by default public and abstract
}

class InterfaceImp implements PublicFeilds {
	public void Method() {
		System.out.println("implementation of interface");
	}

	public static void main(String[] args) {

		InterfaceImp a = new InterfaceImp();

		System.out.println(var);

		a.Method();

	}

}

/*
 * NOTE : 1. Interface in Java is similar to class but, it contains only
 * abstract methods and fields which are final and static.
 * 
 * 2. If the members of the interface are private you cannot provide
 * implementation to the methods or, cannot access the fields of it in the
 * implementing class.
 * 
 * 3. The protected members can be accessed in the same class or,the class
 * inheriting it. But, we do not inherit an interface we will implement it.
 * 
 */
