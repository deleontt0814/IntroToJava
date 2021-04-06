//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
 * This program returns the area of either a square or a triangle, depending on the user input.
 * First, the program prompts the user o input a shape: "s" for square and "t" for triangle.
 * Using a if statement, if the user enters "s" the program prompts the user to enter the length of a side.
 * One entered, the programs runs its function and returns the are of the square (length x length)
 * If a "t" is input, the program prompts the user for a base and a height. The program then runs the algorithm 
 * returning the area of the triangle: (base x height / 2). 
 * */

package Assignment5;

import java.util.Scanner;

public class A5_1 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    double answer = 0.0;

		
	    System.out.println("Enter the type of figure (s or t): ");
	    String type = myObj.nextLine();  // Read user input
    	System.out.println("type: " + type);

	    
	    if (type.equals("t")) {
	    	
		    System.out.println("Enter the base:");
		    String b = myObj.nextLine(); 
		    int base = Integer.parseInt(b);

		    System.out.println("Enter the height:");
		    String h = myObj.nextLine();
		    int height = Integer.parseInt(h);

		    answer = 0.5 * base * height;
		    
	    } 
	    
	    if (type.equals("s")) {
	    	
		    System.out.println("Enter the length of a side: ");
		    String s = myObj.nextLine(); 
		    int side = Integer.parseInt(s);

		    answer = side * side;
	    	
	    }
	    
    	System.out.println("The area is " + answer);	
		
	}
	
	
}

/*
Enter the type of figure (s or t): 
s
type: s
Enter the length of a side: 
4
The area is 16.0


Enter the type of figure (s or t): 
t
type: t
Enter the base:
5
Enter the height:
10
The area is 25.0

*/
