/** A, B and C are classes
 * A is a super class. B is a sub class of A. C is a sub class of B.
 * Create three methods in each class, 2 methods are specific to each class and third method
 *  (override method) should be in all three Classes A, B and C.
 *  Create a class with main method. Create an object for each class A, B and C in main method 
 *  and call every method of each class using its own object/instance.
 *  Call an overridden method with super class reference to B and C class’s objects.
 *  Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only 
 *  for data members */

package Inheritance;

import AcessModifiers.ProtectedModifier;

class A
	{
		void add()
		{
			System.out.println("this is add method");
		}
		
		void sub()
		{
			System.out.println("this is sub method");
		}
		
		void commonMethod()
		{
			System.out.println("this is commonMethod");
		}
	}
class B extends A
{

	void mul()
	{
		System.out.println("this is mul method");
	}
	
	void div()
	{
		System.out.println("this is div method");
	}
	
	@Override
	void commonMethod()
	{
		System.out.println("this is commonMethod");
	}


class C extends B
{
	void percentage()
	{
		System.out.println("this is percentage method");
	}
	
	void fraction()
	{
		System.out.println("this is fraction method");
	}
	
	@Override
	void commonMethod()
	{
		System.out.println("this is commonMethod");
	}
}

class inherit
{
public static void main(String[] args)
{
	 //object for class A
    A a = new A();
    a.add();
    a.sub();
    a.commonMethod();
    //object for class B
    B b = new B();
    b.mul();
    b.div();
    b.commonMethod();	
		
	}

}
}
