package AcessModifiers;

class publiccls
{
	public int a =10;
	
	public void add()
	{
		System.out.println("this is add method");
		
	}
	
}

public class PublicModifiers {

	public static void main(String[] args) {
		
		publiccls pb = new publiccls();
		System.out.println(pb.a);
		pb.add();
		

	}

}
