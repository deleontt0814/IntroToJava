//Any input expected from the user and any output produced by the program should be described in detail
//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
 * This program takes the user input in degrees Celsius and returns it in Degrees Fahrenheit.
 * It does this by reading creating a scanner object, prompting the user to enter a degree in Celsius.
 * Then reading the user input, saving it as a variable "C" and running an algorithm that converts
 * the number to degrees Fahrenheit saved into the variable "F". 
 * The program lastly displays the results. 
 */

package Asignment3;
import java.util.Scanner;  // Import the Scanner class


public class A3_3 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter degrees Celcius:");

	    String read = myObj.nextLine(); 
	    int C = Integer.parseInt(read);
	    double F = ((9 * C) / 5 )+ 32;
	    
	    System.out.println(C + " degrees in Celsius is " + F + " degrees Fahrenheit."); 
		
	
	}

}

/*
 * Enter degrees Celsius:
30
30 degrees in Celsius is 86.0 degrees Fahrenheit.
*/
