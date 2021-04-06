//Timothy de Leon CIS-254-OMH-CRN37965 Mon March 1, 2021 Dave Harden A6_2.java
/*This program will continually prompt the user to enter pounds and will return its conversion to ounces immediately unless the 
 * user inputs a negative number. This is done by using a while loop that remains true as long as pounds is >= 0.
 * When a negative number is input, the loop will finish. If a negative number is entered as the first value, the loop will not even start.
 * */
//class in package Assignment6
package Assignment6;

//imports scanner
import java.util.Scanner;

//opens public class
public class A6_2 {
	
	
//main function
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	    
		
	    int pounds = 0; // boolean declaration for comparing
	    System.out.println("Enter pounds or enter a negative number to exit"); //initially prompt user 
	    pounds = myObj.nextInt();  // Read user input

	    while (pounds >= 0) { // loop will run as long as boolean is true
	    	
	    	   	
		    int ounces = pounds * 16; // converts lbs to oz
		    System.out.println(pounds + " pounds is " + ounces + " ounces");  // Output user input
		    
		    System.out.println("Enter pounds or enter a negative number to exit"); //prompt user in loop
		    pounds = myObj.nextInt();  // Read user input

	    }
	    
	    
	    
}

}

/*
Enter pounds or enter a negative number to exit
1
1 pounds is 16 ounces
Enter pounds or enter a negative number to exit
2
2 pounds is 32 ounces
Enter pounds or enter a negative number to exit
3
3 pounds is 48 ounces
Enter pounds or enter a negative number to exit

*/