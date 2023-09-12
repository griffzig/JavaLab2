package Griffin_Ziegler_lab2;

import java.util.ArrayList;

// holds dice

public class DiceBag {
	
	public int numberOfDice;
	public int sum;
	Die d;
	
	// declare an Arraylist to store instantiated dice objects
	ArrayList<Die> allDice = new ArrayList<>();
	
	// declare an array representation of roll results
	int[] rolls;
	
	public DiceBag (int totalDice) {
		// Constructor
		// Set total # of dice in the bag
		this.numberOfDice = totalDice;
		
		for (int i = 0; i < numberOfDice; i++) {
			allDice.add(new Die());
		}
	}	
	
	public int getSum() {
		// find the sum of all dice rolls
		for (int i = 0; i < rolls.length; i++) {
			sum += rolls[i];
		}
		
		return sum;
	}
		
	public String rollFours() {
		
		// return strings representing each dice roll and sum of dice 
		String rollFours;
		
		// allocate memory for 4 rolls
		rolls = new int[4];
		String[] dice = new String[4];
		
		// roll the dice and store results in the array
		for (int i = 0; i < 4; i++) {
			// initialize variable to represent die object in ArrayList
			Die element = allDice.get(i);
			
			// perform rolls and store them in array
			rolls[i] = element.roll();
			
			// get string representation of dice and store in array
			dice[i] = element.toString();
		}
		
		rollFours = "Dice Rolled\n" + dice.toString() + "\nSum: " + getSum();
		
		return rollFours;
		
	}
	
	public String rollSixes(int numberOfDice) {
		// return strings representing each dice roll and sum of dice 
				String rollSixes;
				
				// allocate memory for 6 rolls
				rolls = new int[6];
				String[] dice = new String[6];
				
				// roll the dice and store results in the array
				for (int i = 0; i < 6; i++) {
					// initialize variable to represent die object in ArrayList
					Die element = allDice.get(i);
					
					// perform rolls and store them in array
					rolls[i] = element.roll();
					
					// get string representation of dice and store in array
					dice[i] = element.toString();
				}
				
				rollSixes = "Dice Rolled\n" + dice.toString() + "\nSum: " + getSum();
				
				return rollSixes;	
	}
	

	public String rollEights(int numberOfDice) {
		// return strings representing each dice roll and sum of dice 
				String rollEights;
				
				// allocate memory for 4 rolls
				rolls = new int[8];
				String[] dice = new String[8];
				
				// roll the dice and store results in the array
				for (int i = 0; i < 8; i++) {
					// initialize variable to represent die object in ArrayList
					Die element = allDice.get(i);
					
					// perform rolls and store them in array
					rolls[i] = element.roll();
					
					// get string representation of dice and store in array
					dice[i] = element.toString();
				}
				
				rollEights = "Dice Rolled\n" + dice.toString() + "\nSum: " + getSum();
				
				return rollEights;
	}

	public String Armageddon() {
		// roll all dice in the bag
		String allRolls;
		
		rolls = new int[totalDice];
	}
	
}
