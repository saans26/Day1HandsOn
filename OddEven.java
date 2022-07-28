/*
 * 2) Write a program to check if a given integer number is odd or even.
 */

package Day1;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer Value");
		int i = sc.nextInt();
		
		if(i%2==0)
		{
			System.out.println(i + " is an even number");
		}
		else
		{
			System.out.println(i + " is an odd number");
		}

	}

}
