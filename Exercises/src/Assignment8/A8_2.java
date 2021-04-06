//Timothy de Leon CIS-254-OMH-CRN37965 Sun Mar 21, 2021 Dave Harden A8_2.java
/*This program creates multiple function called in order to present to the user either the prime numbers listed from 1-1,000 
 * or the perfect numbers from 1 - 10,000. It prompts the user asking for which they would like to see, then displays their choice.
 * After displaying the numbers, it again prompts the user the same question, allowing the user to quit if desired.
 * */

//Import package
package Assignment8;
//Import scanner
import java.util.Scanner;  

public class A8_2 {
	//Create scanner object
	static Scanner myObj = new Scanner(System.in);  
	
	
	/* First function isPerfect take in an integer, checks to see whether or not it is a perfect number. Runs integer in for loop
	 * to run as many times as the number - 1. Using %, if the number is divisible by the counter, it adds the counter to a total.
	 * If the toal = number, returns true.
	 * */
	public static boolean isPerfect(int num) {
		
		int total = 0;
		
		for (int i = 1; i < num; i++) {
			
			if (num % i == 0) {
				
				total += i;
				
			}
			
		}
		
		return (total == num);
		
	}
	
	
	
	
	
	/*Next function checks whether the number is prime or not. It takes in an integer and using a while loop, runs the 
	 *loop as as many times as the input number. Uses a counter starting at 1, divides the number by the counter which increments
	 *by 1 each iteration. Once the number is divisible by a counter (not including 1), the number is not prime and immediately returns false. 
	 *If no numbers are divisible, returns true.
	 */
	public static boolean isPrime(int num) {
		
		int counter = 1;
		
		while (counter < num) {
			
			if (num % counter == 0 && counter != 1) {
//				System.out.println("Not Prime");
				return false;
			} 
				
			counter++;
		}
//		System.out.println("Prime");
		return true;
		
	}
	
	
	
	
	/*Takes the previous function isPrime and runs it through a loop 1000 times, printing out each true iteration from 1 - 1000.
	 * Conditional statement records the number of primes and every 10, creates a new line for organization.
	 * */
	public static void primes() {
		
	    int counter = 0;
	    int primeMax = 1000;
		
		for (int i = 1; i < primeMax; i++) {
    		
    		if (isPrime(i) == true) {
    			System.out.print(i + " ");
    			counter++;
    		}
    		
    		if (counter % 10 == 0 && counter != 0) {
    			System.out.println();
    			counter = 0;
    		}
    		
    	}
		
	}
	
	/*Takes the previous function isPerfect and runs it through a loop 10,000 times, printing out each true iteration from 1 - 10,000.
	 * Conditional statement records the number of primes and every 10, creates a new line for organization.
	 * */	
	public static void perfect() {
		
		int counter = 0;
	    int primeMax = 10000;
		
	    for (int i = 1; i < primeMax; i++) {
    		
    		if (isPerfect(i) == true) {
    			System.out.print(i + " ");
    			counter++;
    		}
    		
    		if (counter % 10 == 0 && counter != 0) {
    			System.out.println();
    			counter = 0;
    		}
    		
    	}
		
		
		
	}
	
	/*Main function where user is prompted and a conditional loop is mae to continuously prompt the user to input or quit.
	 */
	public static void main(String[] args) {
		
	    System.out.println("Prime numbers (1-1000) or perfect numbers (1-10,000)?");
	    System.out.println("Enter \'prime\' for Prime numbers or \'perfect\'for Perfect numbers");
	    String answer = myObj.next();
	    Boolean quit = false;
	    
	    	    	
	    do {
	    	
		   	if (answer.equals("prime") || answer.equals("Prime")) {
		    	
		   		primes();
		    		
		   	} else if (answer.equals("perfect") || answer.equals("Perfect")) {
		    	
		   		perfect();
		    		
	    	} else if (answer.equals("q")) {
	    		
	    		quit = true;
	    		break;
	    		
	    	}
	    	
	    	System.out.println();
	    	System.out.println("Prime numbers (1-1000) or perfect numbers (1-10,000)?");
		    System.out.println("Enter \'prime\' for Prime numbers or \'perfect\'for Perfect numbers");
		    System.out.println("Enter \'q\' to quit");
		    answer = myObj.next();
	    	
	    } while (quit == false);
	    	
		
	}	
	
	
}

/*Prime numbers (1-1000) or perfect numbers (1-10,000)?
Enter 'prime' for Prime numbers or 'perfect'for Perfect numbers
prime
1 2 3 5 7 11 13 17 19 23 
29 31 37 41 43 47 53 59 61 67 
71 73 79 83 89 97 101 103 107 109 
113 127 131 137 139 149 151 157 163 167 
173 179 181 191 193 197 199 211 223 227 
229 233 239 241 251 257 263 269 271 277 
281 283 293 307 311 313 317 331 337 347 
349 353 359 367 373 379 383 389 397 401 
409 419 421 431 433 439 443 449 457 461 
463 467 479 487 491 499 503 509 521 523 
541 547 557 563 569 571 577 587 593 599 
601 607 613 617 619 631 641 643 647 653 
659 661 673 677 683 691 701 709 719 727 
733 739 743 751 757 761 769 773 787 797 
809 811 821 823 827 829 839 853 857 859 
863 877 881 883 887 907 911 919 929 937 
941 947 953 967 971 977 983 991 997 
Prime numbers (1-1000) or perfect numbers (1-10,000)?
Enter 'prime' for Prime numbers or 'perfect'for Perfect numbers
Enter 'q' to quit
perfect
6 28 496 8128 
Prime numbers (1-1000) or perfect numbers (1-10,000)?
Enter 'prime' for Prime numbers or 'perfect'for Perfect numbers
Enter 'q' to quit
q

 * */
