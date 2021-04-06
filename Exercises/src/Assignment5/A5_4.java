//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*
 * This program calculates the price of calls. The user enters a time during the call and the number of minutes for the call.
 * If the call was taken before 0800 and after 1800, the user gets 50% off. The rate will always be $0.40 a minute but the user 
 * is subject to a 4% discount if they go over 60 minutes. After all prices added and discounts deducted, a 4% tax is charged.
 * */

package Assignment5;

import java.util.Scanner;

public class A5_4 {

public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
	    System.out.println("Enter the start time: ");
	    int time = myObj.nextInt();  // Read user input
    	
	    System.out.println("Enter length of call in minutes: ");
	    int length = myObj.nextInt();  // Read user input
    	
    	double rate = length * 0.4; 
    	System.out.printf("Gross cost:$%.2f\n",rate);
    	

    	if (time < 800 || time >= 1800) {
    		
    		rate = rate * .5;
    		
    	}
    	
    	if (length > 60) {
    		
    		rate = rate - (rate *.15);
    		
    	} 
	    
    	double total = (rate * .04) + rate;
    	System.out.printf("The gross cost is $%.2f\n", total);
		
	}
	
}

/*
 * Enter the start time: 
Enter the start time: 
2322
Enter length of call in minutes: 
67
Gross cost:$26.80
The gross cost is $11.85
 * 
 * Enter the start time: 
759
Enter length of call in minutes: 
10
Gross cost:$4.00
The gross cost is $2.08
 * 
 * 
 * Enter the start time: 
1300
Enter length of call in minutes: 
100
Gross cost:$40.00
The gross cost is $35.36
 * 
 * Enter the start time: 
1300
Enter length of call in minutes: 
10
Gross cost:$4.00
The gross cost is $4.16
 * 
 * */


