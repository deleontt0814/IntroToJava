//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
 * This programs creates a simple calculator using a switch statement. 
 * The program prompts the user for two numbers and a mathematical character.
 * If the user enters a character (= - * /) the program enters that case, runs the 
 * character on the two numbers, breaks out of the case, and prints the answer.
 */

package Assignment5;

import java.util.Scanner;

public class A5_3 {
	
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    Double answer = 0.0;

		
	    System.out.println("Enter a number: ");
	    double num1 = myObj.nextDouble();  // Read user input
	    myObj.nextLine(); // break previous line and read the next line

	    System.out.println("Enter an operator[ + - / * ]: ");
	    String operator = myObj.nextLine(); 
	    
	    System.out.println("Enter a number: ");
	    double num2 = myObj.nextDouble(); 
	    
	    switch (operator) {
	    	case "+":
	    		answer = num1 + num2;
	    		break;
	    	case "-":
	    		answer = num1 - num2;
	    		break;
	    	case "*":
	    		answer = num1 * num2;
	    		break;
	    	case "/":
	    		answer = num1 / num2;
	    		break;
	    }
	    
    	System.out.println("Answer: " + answer);	
		
	}
	

}

/*
Enter a number: 
15
Enter an operator[ + - / * ]: 
/
Enter a number: 
3
Answer: 5.0  
 */
