/*
 * 4) Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.
 */

package Day1;
import java.util.Scanner;

public class IdentifyChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0);
		
		if(Character.isAlphabetic(c))
		{
			System.out.println(c + " is an Alphabet");
		}
		else if(Character.isDigit(c))
		{
			System.out.println(c + " is a Digit");
		}
		else
		{
			System.out.println(c + " is Special Character");
		}
		
		
	}

}
