
package Loops;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
	
		int i;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		i = s.nextInt();
		
		System.out.print("Lit of even numbers: ");  
		
		 while (i <= 100) {
	            System.out.println(i);
	            i += 2;
	}

}
}