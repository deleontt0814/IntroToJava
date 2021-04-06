//Timothy de Leon CIS-254-OMH-CRN37965 Mon March 1, 2021 Dave Harden A6_2.java
/*This program will continually prompt the user to enter their age. if a negative number is input, the results will print. 
 * If a positive number is input, that number will be saved as both the youngest and oldest age, then enter a while loop
 * prompting them for their food preference. Counters for each preference increment every time a preference is entered. 
 * The values are added to an double value, and a counter incremented every time new non-negative values are entered.
 * Their age group counter increments depending on the age. If the age entered is less than the "youngest" saved age, it will be
 * replaced and vice-versa for oldest. They are prompted again to enter the age at the end of the loop or a negative number, immediately exiting 
 * the loop and printing the results. 
 * */
package Assignment6;

import java.util.Scanner;

public class A6_3 {

public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	  
		
		//declare variables
		int firstGroup = 0;
		int secondGroup = 0;
		int thirdGroup = 0;
		int fourthGroup = 0;
		int fifthGroup = 0;
		
	    double average = 0;
	    double counter = 0;
	    
    	double youngest = 0;
    	double oldest = 0;
    	
    	int popcorn = 0;
    	int soda = 0;
    	int both = 0;
    	
    	String food;
    	
	    System.out.print("Enter age of attendee (negative number to quit): "); //initially prompt user 
	    double age = myObj.nextInt();  // Read user input
    	
	    // if a negative number is initially input, skip saving the age
	    if (age > 0) {
	    	
	    	youngest = age;
	    	oldest = age;
	    
	    }
	    
	    while (age >= 0) { // loop will skip if a negative number is initially entered
	    	
		    System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): "); //prompt user if a number is entered
		    food = myObj.next();  // Read user input

	    	if (food.equals("p")) {
	    		popcorn++;
	    	}
	    	if (food.equals("s")) {
	    		soda++;
	    	}
	    	if (food.equals("b")) {
	    		both++;
	    	}

	    	// calculate average
	    	average = average + age;
	    	counter++;
	    	
	    	// conditionals to count age groups
	    	if (age > 0 && age <= 18) {
	    		firstGroup++;
	    	} 
	    	if (age >= 19 && age <=30) {
	    		secondGroup++;
	    	}
	    	if (age >=31 && age <= 40) {
	    		thirdGroup++;
	    	}
	    	if (age >= 41 && age <= 60) {
	    		fourthGroup++;
	    	}
	    	if (age > 60) {
	    		fifthGroup++;
	    	}
	    	
	    	// with initial oldest and youngest age saved, checks current value and compares it to the oldest and youngest
	    	if (age > oldest) {
	    		oldest = age;
	    	}
	    	if (age < youngest) {
	    		youngest = age;
	    		
	    	}
	    	
	    	// prompts user at end of loop to avoid excess running of code
		    System.out.print("Enter age of attendee (negative number to quit): "); //initially prompt user 
		    age = myObj.nextInt();  // Read user input
   	

	    }
	    
	    //print values
	    System.out.println("age 0 to 18: " + firstGroup);  
	    System.out.println("age 19 to 30: " + secondGroup); 
	    System.out.println("age 31 to 40: " + thirdGroup); 
	    System.out.println("age 41 to 60: " + fourthGroup); 
	    System.out.println("over 60: " + fifthGroup);
	    
	    //calculate average
	    average = average / counter;
	    System.out.println("food preference popcorn: " + popcorn); 
	    System.out.println("food preference soda: " + soda);
	    System.out.println("food preference both: " + both); 

	    System.out.printf("The average age was %.1f %n", average); 
	    System.out.println("The oldest age was " + oldest); 
	    System.out.println("The youngest age " + youngest); 



	    
}

	
}

/*Enter age of attendee (negative number to quit): 34
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): s
Enter age of attendee (negative number to quit): 16
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): b
Enter age of attendee (negative number to quit): 68
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): b
Enter age of attendee (negative number to quit): 53
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): s
Enter age of attendee (negative number to quit): 39
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): p
Enter age of attendee (negative number to quit): 23
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): s
Enter age of attendee (negative number to quit): 21
Enter food preference ('p' for popcorn, 's' for soda, 'b' fo both): s
Enter age of attendee (negative number to quit): -1
age 0 to 18: 1
age 19 to 30: 2
age 31 to 40: 2
age 41 to 60: 1
over 60: 1
food preference popcorn: 1
food preference soda: 4
food preference both: 2
The average age was 36.3 
The oldest age was 68.0
The youngest age 16.0*/
