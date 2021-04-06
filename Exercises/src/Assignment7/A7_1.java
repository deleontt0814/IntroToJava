//Timothy de Leon CIS-254-OMH-CRN37965 Mon March 1, 2021 Dave Harden A6_2.java
/*This program searches for the first and last input number 7. It prompts the user to enter
 * how many times they wish to enter. From there, it enters a for loop ending when the loop runs
 * as many times as the user entered. Inside the loop the user enters a number. The first 7 is saved
 * into its own variable. Each 7 is saved into a "lastSeven" variable and is overwritten each time a 7 is entered.
 * */
package Assignment7;
// import scanner
import java.util.Scanner;

public class A7_1 {	

	public static void main(String[] args) {
			// create scanner object
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object	  
	    	
		    System.out.print("How many numbers will be entered?: "); //initially prompt user 
		    int numbers = myObj.nextInt();  // Read user input
		    //declare variables
		    int firstSeven = 0;
		    int lastSeven = 0;
		    //create for loop, run as many times as user entered, save counter as "count" starting at 1
		    for (int count = 1; count < numbers + 1; count++) {
		    	
			    System.out.print("Enter number: "); //prompt user
			    int present = myObj.nextInt();  // Read user input
			    
			    //if there is no 7 previously saved, save the first 7
		    	if (present == 7 && firstSeven == 0) {
		    		
				    firstSeven = count;
		    		
		    	}
		    	// overwrite this variable with the location every time a 7 is input
		    	if (present == 7) {
		    		
				    lastSeven = count;
		    		
		    	}
			    
		    }
		    //if no 7s were entered, prompt user
		    if (firstSeven == 0) {
		    	
			    System.out.print("Sorry, no 7's were entered."); //initially prompt user 
		    	
		    } else { //if 7s were entered, show the first and last position
		    	
		    	System.out.println("The first 7 was in position: " + firstSeven); //initially prompt user 
		    	System.out.println("The last 7 was in position: " + lastSeven); //initially prompt user 
		    
		    }	  
		    
	}
	
	
}

/*   How many numbers will be entered?: 8
Enter number: 5
Enter number: 7
Enter number: 6
Enter number: 7
Enter number: 7
Enter number: 3
Enter number: 8
Enter number: 6
The first 7 was in position: 2
The last 7 was in position: 5

How many numbers will be entered?: 5
Enter number: 1
Enter number: 2
Enter number: 3
Enter number: 7
Enter number: 8
The first 7 was in position: 4
The last 7 was in position: 4

How many numbers will be entered?: -1
Sorry, no 7's were entered.

 * */
 