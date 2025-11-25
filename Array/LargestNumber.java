//Write a program to find the second largest number in an array

package Array;

public class LargestNumber 
{
	public static void main(String[] args) 
	{
		int temp, size;

		int array[] = { 10, 20, 35, 63, 96, 57 };
		
		// finding size
		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Third second largest number is:: " + array[array.length - 2]);
	}

}
