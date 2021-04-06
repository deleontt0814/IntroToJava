//Timothy de Leon CIS-254-OMH-CRN37965 Tues Feb 23, 2021 Dave Harden A3_3.java
/*This program creates a function called multadd. This function takes in 3 numbers in the form of doubles
 * and runs an algorithm then returns the result.
 * The result is saved into different variables for different inputs and printed.
 * */

package Assignment4;

public class A4_2 {

	public static double multadd(double a, double b, double c) {
		
		double result = a * b + c;
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		double result1 = multadd(1.0, 2.0, 3.0);
		System.out.println("1.0 * 2.0 + 3.0 = " + result1);
		
		double result2 = multadd(2.0, 4.0, 6.0);
		System.out.println("2.0 * 4.0 + 6.0 = " + result2);
		
		double result3 = multadd(5.0, 8.0, 13.0);
		System.out.println("5.0 * 8.0 + 13.0 = " + result3);
	}

}

/*
1.0 * 2.0 + 3.0 = 5.0
2.0 * 4.0 + 6.0 = 14.0
5.0 * 8.0 + 13.0 = 53.0
 * */
