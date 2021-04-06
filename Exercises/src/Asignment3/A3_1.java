//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
* This program converts pounds into ounces. 
* It does this by creating a scanner object, prompting the user to enter the number of pounds to be converted. 
* Then Reads the input and saves it into a variable "pounds"
* The program them multiplies this number by 16 and prints the results.
*/

package Asignment3;
import java.util.Scanner;  // Import the Scanner class


public class A3_1 {

	public static void main(String[] args) {
		

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter pounds");

	    String pounds = myObj.nextLine();  // Read user input
	    int ounces = Integer.parseInt(pounds) * 16;
	    System.out.println(pounds + " pounds is " + ounces + " ounces");  // Output user input

			
	}

}

/* Enter pounds
4
4 pounds is 64 ounces
*/
