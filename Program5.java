/*
 * 5) Write a program to accept gender ("Male" or "Female") and age from the key board and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

 */

package Day1;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gender :");
		String g = sc.next();
		
		System.out.println("Age :");
		int a = sc.nextInt();
		
		if(g.equals("Female"))
		{
			if(a>=1 && a<=58)
			{
				System.out.println("Percentage of Interest is 8.2%");
			}
			else if(a>=59 && a<=100)
			{
				System.out.println("Percentage of Interest is 9.2%");
			}
		}
		if(g.equals("Male"))
		{
			if(a>=1 && a<=58)
			{
				System.out.println("Percentage of Interest is 8.4%");
			}
			else if(a>=59 && a<=100)
			{
				System.out.println("Percentage of Interest is 10.5%");
			}
		}

	}

}
