/*
 * 6) Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2)
i/p:A
o/p:A->a
 */

package Day1;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c1,c2;
		
		System.out.println("Enter a Character :");
		char c = sc.next().charAt(0);
		
		if(c>='A'&& c<='Z')
		{
			c1 = Character.toLowerCase(c);
			System.out.println(c + "->" + c1);
		}
		else if(c>='a' && c<='z')
		{
			c2 = Character.toUpperCase(c);
			System.out.println(c + "->" + c2);

		}

	}

}
