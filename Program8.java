/*
 * 8) Write a program to receive a number and print the corresponding month name.
Example1)
I/P: 12
O/P Expected : December
Example2)
I/P: 15
O/P Expected : Invalid month
 */

package Day1;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4: 
			System.out.println("April");
			break;
		case 5: 
			System.out.println("May");
			break;
		case 6: 
			System.out.println("June");
			break;
		case 7: 
			System.out.println("July");
			break;
		case 8: 
			System.out.println("Augest");
			break;
		case 9: 
			System.out.println("September");
			break;
		case 10: 
			System.out.println("October");
			break;
		case 11: 
			System.out.println("November");
			break;
		case 12: 
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Inputs");
		}

	}

}
