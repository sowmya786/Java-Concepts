package OverLoading;

public class MethodOverloading
{

	public void add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);	
	}
	
	public void add(int a, int b, int c)
	{
		int d = a + b + c;
		System.out.println(c);	
	}
	
	public void details(String name)
	{
		System.out.println(name);
	}
	
	public void details(String name, int age)
	{
		System.out.println(name +","+ age);
	}
	
	public void details1(String name)
	{
		System.out.println(name);
	}
	
	public void details1(int age)
	{
		System.out.println(age);
	}
	
	
	public static void main(String[] args)
	{
		MethodOverloading ml = new MethodOverloading();
		ml.add(10, 20);
		ml.add(10, 20, 30);
		ml.details("riya");
		ml.details("riya", 25);
		ml.details1(24);
		ml.details1("diya");
		
		

	}

}
