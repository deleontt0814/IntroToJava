//Timothy de Leon CIS-254-OMH-CRN37965 Mon March 1, 2021 Dave Harden A6_1.java
/*This program will continually prompt the user to enter pounds and will return its conversion to ounces immediately. The loop will then
 * prompt the user to see if they want to run the program again, if the user enters "y" or "Y", the program will run again.
 * */
//class in package Assignment6
package Assignment6;

//imports scanner
import java.util.Scanner;

//opens public class
public class A6_1 {
	
//main function
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	    
		
	    String tester = "Y"; // boolean declaration for comparing

	    while (tester.equals("Y") || tester.equals("y")) { // loop will run as long as boolean is true
	    	
		    System.out.println("Enter pounds: ");
		    int pounds = myObj.nextInt();  // Read user input
		    
		    int ounces = pounds * 16; // converts lbs to oz
		    System.out.println(pounds + " pounds is " + ounces + " ounces");  // Output user input
		    
		    
		    System.out.println("Enter \"Y\" to run again");  // Output user input
		    tester = myObj.next();  // Read user input

	    }
	    
}

}

/*
Enter pounds: 
1
1 pounds is 16 ounces
Enter "Y" to run again
y
Enter pounds: 
2
2 pounds is 32 ounces
Enter "Y" to run again
Y
Enter pounds: 
3
3 pounds is 48 ounces
Enter "Y" to run again
N

*/
