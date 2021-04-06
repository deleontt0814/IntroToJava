//Timothy de Leon CIS-254-OMH-CRN37965 Saturday April 3, 2021 Dave Harden A9_1.java
/*This program takes a user input of integers and saves them into an array.
 * The program only saves unique values and can save up to 1000 values.
 * It does this using 3 different methods: readNumber, printArray, and unqueCheck
 */
package Assignment9;
//import java scanner
import java.util.Scanner;


public class A9_1 {
	
	//main function
	public static void main(String[] args) { 
		
		//initial list list and list size
        final int ARRAY_SIZE = 1000;
		int[] list = new int[ARRAY_SIZE];

		//call read number function
		//call print array function
		printArray(list, readNumber(list, ARRAY_SIZE));

		
	}
	
	
	
	
	
	
	/*Array read number, takes in an array and size. Returns an integer counter.
	 * First the user is prompted to enter a non-negative number.
	 * If the number is negative, the user will not enter the loop, and the method will return counter = 0.
	 * Uses a while loop to run until the user enters a negative number. 
	 * In the while loop, increments a counter and updates the list with a method called unique check.
	 */
	public static int readNumber(int[] list, int size) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object	  
		
		System.out.print("Enter a non-negative integer (negative to quit): "); //prompt user 	    
		int numbers = myObj.nextInt();  // Read user input		
		int counter = 0; //create counter
		
		//create while loop, enters loop if first number is positive, exists loop if a negative number is entered
		while (numbers > 0 && counter < size) {
			
			// calls unique check function, take in list and user input	
			//returns true if the number is unique. 
			//Takes in a list, the input number, and the counter
			if (uniqueCheck(list, numbers, counter)) {
				
				//Adds a number to the list at the counter
				list[counter] = numbers;
				//increments the counter every time a number is added
				counter++;
				
			}
			
			//makes sure the counter does not exceed the size. Will not prompt the user when array > max size.
			if (counter < size) {
			
				System.out.print("Enter a non-negative integer (negative to quit): "); //prompt user 	    
				numbers = myObj.nextInt();  // Read user input
			
			}
			
		}
		// returns counter		
		return counter;	
		
	}
	
	
	
	
	
	/* Method takes in the list and a counter. Prints the array with a for loop.
	 * Uses a for loop to run the number of times as a counter, not the size of the array,
	 * thus not printing 1000 values.
	 * */
	public static void printArray(int[] list, int counter) {
		
		for (int i = 0; i < counter; i++) {
			
			System.out.println(list[i]);
			
		}
		
	}
	
	
	
	
	/*UniqueCheck checks the array to ensure there are no duplicates.
	 * For loop runs through array up to the counter, and not thw whole array.
	 * Returns false if the number equals an element in the array.
	 * If not, returns true.
	 * */
	public static boolean uniqueCheck(int[] list, int number, int counter) {
		
		for (int i = 0; i < counter + 1; i++) {
			
			if (number == list[i]) {
				
				return false;
				
			} 
					
		}
		
		return true;

	}
	
	
	
	

}
