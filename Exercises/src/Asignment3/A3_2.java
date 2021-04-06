//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*This program converts a total number of cents into the appropriate amounts of coins.
 * The programs prompts the user to input a total number of cents, the first allocates a portion of that to quarters.
 * It does this by dividing the total change by 25 to get the toal number of quarters, then using the %, obtains the remainder of coins.
 * It repeats this process for nickles, dimes, and lastly pennies.
 * */

package Asignment3;
import java.util.Scanner;  // Import the Scanner class


public class A3_2
{

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the number of cents");

	    String read = myObj.nextLine(); 
	    int cents = Integer.parseInt(read);
	    
	    int quarters = cents / 25;
	    int leftover = cents % 25;
	    
	    int dimes = leftover / 10;
	    leftover = leftover % 10;
	    
	    int nickles = leftover /5;
	    leftover = leftover % 5;

	    System.out.println("pennies: " + leftover);  // Output user input
	    System.out.println("nickles: " + nickles);  // Output user input
	    System.out.println("dimes: " + dimes);  // Output user input
	    System.out.println("quarters: " + quarters);  // Output user input
		
	
	}

}

/*
Enter the number of cents
119
pennies: 4
nickles: 1
dimes: 1
quarters: 4
*/