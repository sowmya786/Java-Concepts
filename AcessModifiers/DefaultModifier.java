package AcessModifiers;

class Default
{
	int a = 10;
	
	void add()
	{
		System.out.println("This is add method");
	}
	
	public class DefaultModifier
	{

	public static void main(String[] args) 
	{
		Default d = new Default();
		
		System.out.println(d.a);
		d.add();
		
	}

}
}