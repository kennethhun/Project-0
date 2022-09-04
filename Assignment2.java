/*------------------------------------------------------------- 
// AUTHOR: Kenneth Hung
// FILENAME: Assignment2.java
// SPECIFICATION: The program takes 2 players input, either rock, paper, or scissors
 * 				  and determines who would win. If an alternative output is given it
 * 				  would state the answer is invalid.
 */
// FOR: CS 1400 - Assignment #2
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) { // main method
       
		// declared variables
		String Player1Input = "";
        String Player2Input = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Player 1: Choose rock, scissors, or paper: "); // Player1 input
        Player1Input = scan.nextLine();
        System.out.println("Player 2: Choose rock, scissors, or paper: "); // Player2 input
        Player2Input = scan.nextLine();
        
        // converting all inputs to lowercase
        Player1Input = Player1Input.toLowerCase();
        Player2Input = Player2Input.toLowerCase();
		
        if ( Player1Input.equals("rock") ) // Player 1 inputs rocks
        {	
        	if (Player2Input.equals("rock") ) 
        		System.out.println("It is a tie.");
        	else if ( Player2Input.equals("paper") )
        		System.out.println("Player 2 wins.");
        	else if ( Player2Input.equals("scissors") )
        		System.out.println("Player 1 wins.");
        	// In case no correct value in inputed for player 2
        	else
        		System.out.println("Wrong choice!");
        }
        
        if ( Player1Input.equals("paper") ) // Player 1 inputs paper
        {	
        	if (Player2Input.equals("rock") ) 
        		System.out.println("Player 1 wins.");
        	else if ( Player2Input.equals("paper") )
        		System.out.println("It is a tie.");
        	else if ( Player2Input.equals("scissors") )
        		System.out.println("Player 2 wins.");
        	// In case no correct value in inputed for player 2
        	else
        		System.out.println("Wrong choice!");
        }
        
        if ( Player1Input.equals("scissors") ) // Player 1 inputs scissors
        {	
        	if (Player2Input.equals("rock") ) 
        		System.out.println("Player 2 wins.");
        	else if ( Player2Input.equals("paper") )
        		System.out.println("Player 1 wins.");
        	else if ( Player2Input.equals("scissors") )
        		System.out.println("It is a tie.");
        	// In case no correct value in inputed for player 2
        	else
        		System.out.println("Wrong choice!");
        }
       
        // In case no correct value is inputed for player 1
        if (!(Player1Input.equals("rock") || Player1Input.equals("paper") || Player1Input.equals("scissors")))
        	System.out.println("Wrong choice!");
        
        scan.close();
        
	}

}
