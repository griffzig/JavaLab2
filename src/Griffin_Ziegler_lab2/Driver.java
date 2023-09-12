package Griffin_Ziegler_lab2;

import java.util.*;

/* Griffin Ziegler
 * September 8, 2023
 * Register test driver
 */

public class Driver {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		/* 1. Implements the OOP ChangeMaker application
		 * - Currency enum
		 * - Purse class
		 * - Register class
		 */
		
		// initialize user purse and register
		Purse cashIn = new Purse();
		Register reg = new Register();
		
		// add currency to purse
		cashIn.setHundredsVal(0);
		cashIn.setTwentiesVal(0);
		cashIn.setTensVal(0);
		cashIn.setFivesVal(0);
		cashIn.setOnesVal(0);
		cashIn.setFiftyCentPcsVal(0);
		cashIn.setDimesVal(0);
		cashIn.setNickelsVal(0);
		cashIn.setPenniesVal(0);
		
		// welcome screen
		System.out.println("Welcome to AutoZone Auto Parts.\n");
		System.out.println("Most popular items for sale:\n");
		System.out.println("1. Duralast Platinum Battery: $249.99\n");
		System.out.println("2. Valvoline High Mileage Synthetic Blend Engine Oil: $30.99\n");
		System.out.println("3. Duralast Gold Ceramic Pads: $52.99\n");
		System.out.println("Make your choice (1, 2, or 3): ");
		
		// create scanner
		int userChoice = sc.nextInt();
		
		switch (userChoice) {
			
		case 1:
			 reg.makeChange(cashIn, 249.99);
			 break;
			 
		case 2:
			reg.makeChange(cashIn, 30.99);
			break;
		
		case 3:
			reg.makeChange(cashIn, 52.99);
			break;
		}
		
		System.out.println("Cashout: " + reg.restock());
		System.out.println("Total profits of the day: " + reg.empty());
		
		/* 1. Implements DiceRoller application
		 * - Die class
		 * - DiceBag class
		 */
		
		// initialize DiceBag with 12 dice
		DiceBag db = new DiceBag(12);
		System.out.println("Roll fours:\n" + db.rollFours());
		
	}

}