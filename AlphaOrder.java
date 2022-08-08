/*
 * 3) Initialize two character variables in a program and display the characters in alphabetical order.
Example1) if the first character is 's' and second character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e

 */

package Day1;
import java.util.Scanner;

public class ColorCode {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the code :");
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default: System.out.println("Invalid Input");
		
		}
	}

}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Securit
