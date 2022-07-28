package Day1;
/*
 * 1) Write a program to check if a given integer number is Positive, Negative, or Zero.
 */

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer Value");
		int i = sc.nextInt();
		
		if(i>0)
		{
			System.out.println(i + " is a Positive Number");
		}
		else if(i<0)
		{
			System.out.println(i + " is Negative Number");
		}
		else
		{
			System.out.println("Value entered is zero");
		}

	}

}
