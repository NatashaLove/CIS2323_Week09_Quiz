import java.util.*;
import Dice.*;
import Yahtzee.*;

public class  playYahtzee {
	
	public static void main (String [] args) {
	
		char next='a';
		
		//print menu
		System.out.println("\nLet's play YAHTZEE!");
		
		while(next != 'x') {
			//all menu is in a separate method - described below
			next = printMenu();
				
			if(next == '1') {
				Yahtzee player1 = new Yahtzee();
			}
			else if (next == '2') {
				Yahtzee player2 = new Yahtzee();
			}
			else if (next == 'c') {
				System.out.println("\nPlayer1 WINS!");
			}
		}
	//roll
	
	// quit
	}
	
	static char printMenu (){
	
	char next='a';
	Scanner inputDevice=new Scanner(System.in);
		
	System.out.println();
	System.out.println("\nPlayer1, do you want to roll? (1)");
	System.out.println("\nPlayer2, do you want to roll? (2)");
	System.out.println("\nDo you want to quit the game? (x)");
	System.out.println("\nDo you want to cheat? (c)");
	System.out.println("\nWhat do you want to do: ");
			
	next = inputDevice.next().charAt(0);
	inputDevice.nextLine(); // need it right after input taking a char or int - or will occupy the next input
		
	return next;
	} 	
}