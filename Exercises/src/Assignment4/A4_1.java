//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*This program creates multiple functions that print requested values.
 * The first function printAmerican takes in 4 parameters: day, month, date, and year
 * and prints out the date in the American standard.
 * The second program does the same but instead of the American standard, prints the European standard.
 * */

package Assignment4;

import java.util.Scanner;

public class A4_1 {

	
public static void printAmerican(String day, String month, int date, int year) {
	
	System.out.print(day + ", ");
	System.out.print(month + " ");
	System.out.print(date + ", ");
	System.out.print(year);
	
}

public static void printEuropean(String day, String month, int date, int year) {
	
	System.out.print(day + ", ");
	System.out.print(date + " ");
	System.out.print(month + ", ");
	System.out.print(year);
	
}
	

public static void main(String[] args) {
	
	System.out.println("American: ");
	printAmerican("Tuesday", "February", 16, 2021);
	
	System.out.println("\n\n" + "European: ");
	printEuropean("Tuesday", "February", 16, 2021);
	
	System.out.println("\n\n" + "American: ");
	printAmerican("Thursday", "July", 4, 1776);
	
	System.out.println("\n\n" + "European: ");
	printEuropean("Thursday", "July", 4, 1776);
	
	System.out.println("\n\n" + "American: ");
	printAmerican("Sunday", "December", 7, 1941);
	
	System.out.println("\n\n" + "European: ");
	printEuropean("Sunday", "December", 7, 1941);
	
	
	}
	
	
}

/*
American: 
Tuesday, February 16, 2021

European: 
Tuesday, 16 February, 2021

American: 
Thursday, July 4, 1776

European: 
Thursday, 4 July, 1776

American: 
Sunday, December 7, 1941

European: 
Sunday, 7 December, 1941
*/