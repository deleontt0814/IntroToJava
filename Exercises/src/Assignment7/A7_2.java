//Timothy de Leon CIS-254-OMH-CRN37965 Mon March 1, 2021 Dave Harden A6_2.java
/*This program takes a user input of a number and calculates the sum of squares up to that number.
 * This program will repeatedly run itself until the user enters a number < 1. It does this using a while loop
 * that inputs the number into an equation if the number is > 0 and exits the loop if a number < 1 is entered.
 */
package Assignment7;

//import scanner 
import java.util.Scanner;

public class A7_2 {
	
	public static void main(String[] args) {
		
		// create scanner object
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	  
    	
	    System.out.print("Enter a number greater than 0 (less than 1 to quit): "); //prompt user 
	    int numbers = myObj.nextInt();  // Read user input
	    
	    // if initial input is < 1, code exits, if > 0, enter while loop
	    while (numbers > 0) {
	    	// equation to calculate squares [n(n+1)(2n+1)]\6 saved as answer
		    int answer = (numbers*(numbers + 1)*((numbers*2)+1))/6;
	    	//print number entered and answer
		    System.out.println("The sum of squares from 1 to " + numbers + " is " + answer); 
		    // prompt user again
		    System.out.print("Enter a number greater than 0 (less than 1 to quit): "); 
		    numbers = myObj.nextInt();  // Read user input
	    		
	    }
	    
	}

}
/*
Enter a number greater than 0 (less than 1 to quit): 4
The sum of squares from 1 to 4 is 30
Enter a number greater than 0 (less than 1 to quit): 1
The sum of squares from 1 to 1 is 1
Enter a number greater than 0 (less than 1 to quit): 0
*/
