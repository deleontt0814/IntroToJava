//Timothy de Leon CIS-254-OMH-CRN37965 Sun Mar 21, 2021 Dave Harden A8_1.java
/*This program creates multiple function called i order to construct a rocket designed to fit requested dimensions. 
 * Functions are initialized before the main function. Several functions return integers which will be used as parameters for other functions.  
 * The rocket starts with a cone, defined as its own function, then has separate stages. The number of stages depends on user input.
 * The stages are boxes whose width and height also depend on user input. After the requested number of stages and their dimensions
 * are input, a final cone is added. The size of the cone is constant.
 * */


package Assignment8;
//Import the Scanner class
import java.util.Scanner;  

public class A8_1 {
	
	// Create a Scanner object
	static Scanner myObj = new Scanner(System.in);  
    
	
	
	
	
	
/*	First method draws horizontal lines. Method takes in numX's depending on the user input.
	This method is responsible for making the top and bottom of the box with X's.
	The length is defined by the user input, placed as the counter of a for loop.
*/
    public static void drawHorizontalLine(int numXs) {               
        for (int count = 0; count < numXs; count++){
            System.out.print("X");
        }
        System.out.println();
    }
    
    
    
    
    
    
    
/*	Next method creates the height of the box. The height is determined by the user input.
    The sides are created by taking a user input of the number of spaces and number of rows.
    Method calls function drawRunRow in a loop designed to run as many times as the number of rows.
*/
    public static void draw2VerticalLines(int numSpaces, int numRows) {                          
        for (int rowCount = 0; rowCount < numRows; rowCount++){
            drawOneRow(numSpaces);
        }
    }

    
    
    
    
    
/*
 	This method takes in a number of spaces to be used in a loop.
 	First an X is printed. 
 	Then the loop prints a " " for the number of spaces taken. 
 	Finally, a final X is printed, creating the walls of the box.
*/    
    public static void drawOneRow(int numSpaces) {
        System.out.print("X");
        for (int spaceCount = 0; spaceCount < numSpaces; spaceCount++){    
            System.out.print(" ");
        }
        System.out.println("X"); 
    }
    
    
    
    
/*	This method draws a cone using multiple print statements.
 * */
    public static void drawCone() {
        System.out.println("  X");
        System.out.println(" X X");
        System.out.println("X   X");

    }
	
    
    
    
    
    
/*	This function draws the stage itself in the shape of the box.
 * It calls the previous functions to, in order, draw an initial line ox X's
 * depending on the input width, draw the walls of the box, the number of rows depending on the height - 2 
 * to account for the top and bottom, and the input width. 
 * */    
public static void drawBox(int stages, int width, int height) {
		
		// Top
		drawHorizontalLine(width);
		draw2VerticalLines(width - 2, height - 2);
		drawHorizontalLine(width);
		
	}
        
	


/*	This final function draws the rocket itself. It first draws the cone, calling the drawCone function,
 * then draws the box in a for loop. The number of stages drawn depends on the number of stages requested.
 * Then draws a final cone. This function takes in the height, width, and stages. 
 * */
public static void drawRocket(int height, int width, int stages) {
	
	drawCone();
	
	for (int i = 0; i < stages; i++) {
	
	drawBox(stages, width, height);	
	
	}
		
	drawCone();

}




// Function prompts the user for a width and returns the value as an integer
public static int getWidth() {
	
    System.out.print("Enter width: ");
    return myObj.nextInt();
	
}







//Function prompts the user for a width and returns the value as an integer
public static int getHeight() {
	
    System.out.print("Enter width: ");
    return myObj.nextInt();
	
}






//Function prompts the user for a height and returns the value as an integer
public static int getNumStages() {
	
    System.out.print("Enter Stages: ");
    return myObj.nextInt();
	
}






//Main Function
	public static void main(String[] args) {
        
		//Stage 3 calls the get width, get height, and get numStages then calls the drawRocket function.
        int stageWidth = getWidth();
        int stageHeight = getHeight();
        int numStages = getNumStages();
        drawRocket(stageHeight, stageWidth, numStages); 
        
        
//        	Phase 1, after modifications
//        	drawCone();
//    		drawBox(stages, width, height);
//    		drawCone();
        
//			Phase 2 prompting statements
//			System.out.print("Enter height: ");
//        	int stageHeight = myObj.nextInt(); // 2 is subtracted from the height to adjust for the top and bottom rows
//        
//        	System.out.print("Enter width: ");
//        	int stageWidth = myObj.nextInt();
//        
//        	System.out.print("Enter Stages: ");
//        	int numStages = myObj.nextInt();
        
        
	}

}

//Enter width: 7
//Enter width: 4
//Enter Stages: 2
//  X
// X X
//X   X
//XXXXXXX
//X     X
//X     X
//XXXXXXX
//XXXXXXX
//X     X
//X     X
//XXXXXXX
//  X
// X X
//X   X
