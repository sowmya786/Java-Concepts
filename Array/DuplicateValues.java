//Write a function to find the duplicate values of an array
package Array;

public class DuplicateValues 
{

	public static void main(String[] args) 
	{
		int size;
		int array[] = { 10, 20, 35, 10, 96, 57 };
		
		size = array.length;

		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if(array[i]==array[j] && i!=j)
				{
					System.out.println(array[j]);
					
					//for (int i = 0; i < j; i++)
			            System.out.print(array[i] + " ");
				}
				
				  /* printing array elements
		        for (int i = 0; i < j; i++)
		            System.out.print(array[i] + " "); */
			}
	}

}
}