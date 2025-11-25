//Access the PROTECTED fields and methods from any class in different package
package Inheritance;

import AcessModifiers.ProtectedModifier;

public class ProtectedSecifier extends ProtectedModifier

{
	void parentMethod()
	{
		System.out.println("this is a parent method");
		System.out.println(ProtectedModifier.a);
}
	
	
	public static void main(String[] args)
	{
	ProtectedSecifier p= new ProtectedSecifier();
		p.add(); // accessing method different package of protected class
		p.parentMethod();
	}

}
