package AcessModifiers;

 public class PrivateModifier
 {
	private int a = 10;
	
	private void add()
	{
		System.out.println("this is add method");
		
	}

	public static void main(String[] args)
	{
		PrivateModifier pv = new PrivateModifier();
		pv.add();
		System.out.println(pv.a);
		
	}

}
