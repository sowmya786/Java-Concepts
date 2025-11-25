package AcessModifiers;

public class ProtectedModifier  
{
	
	static protected  int a = 10; 
	
	protected void add() 
	{
		System.out.println("this is add method");
	//	System.out.println(pm.a);
	}
		

	public static void main(String[] args) 
	
	{
		ProtectedModifier pm = new ProtectedModifier();
		pm.add();
		System.out.println(pm.a);
		
	}

}
