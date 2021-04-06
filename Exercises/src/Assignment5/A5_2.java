//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
 * Using conditional statements, this program returns what level of schooling the user should be in depending on the number
 * of years they entered. If the user has 0 or less years, they have no schooling. If they have one or more but six or less, 
 * they are in elementary school. Middle school only includes 7 and 8 years and high school includes 9 through 12. College includes 
 * anything greater than 12. 
 * */


package Assignment5;

import java.util.Scanner;

public class A5_2 {

public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    String answer = "no answer";

		
	    System.out.println("How many years of schooling have you completed?: ");
	    double type = myObj.nextDouble();  // Read user input
    	System.out.println("years: " + type);

	    
	    if (type <= 0) {

		    answer = "none";
		    
	    } 
	    
	    if (type >= 1 && type <= 6) {

		    answer = "Elementary School";
	    	
	    }
	    
	    if (type >= 7 && type <= 8) {

		    answer = "Middle School";
	    	
	    }
	    
	    if (type >= 9 && type <= 12) {

		    answer = "High School";
	    	
	    }
	    
	    if (type > 12) {

		    answer = "College";
	    	
	    }
	    
	    
    	System.out.println(answer);	
		
	}
	
	
}

/*
How many years of schooling have you completed?: 
12
years: 12.0
High School
 * */
