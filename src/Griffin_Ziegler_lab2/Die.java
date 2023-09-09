package Griffin_Ziegler_lab2;

import java.util.Random;

// captures the essence of a single die

public class Die {

	public int roll; // result of the int roll()
	public int sides;
	private String face; // store the current face
	
	Die () {
		// Constructor
		sides = 6;
		
	}
	
	public int roll() {
		int min = 1;
		// instantiate Random object
		Random rand = new Random();
		
		// roll the die, numbers 
		roll = rand.nextInt(sides - min + 1) + min;
		
		return roll;
	}
	
	public String getFace() {
		// return the current face of the die
		// switch case to determine face based off roll
		switch (roll) {
			
		case 1:
			face = "1";
			break;
			
		case 2:
			face = "2";
			break;
		
		case 3:
			face = "3";
			break;
			
		case 4: 
			face = "4";
			break;
			
		case 5: 
			face = "5";
			break;
			
		case 6:
			face = "6";
			break;
			
		default:
			face = "";
			
		}
		return face;
	}
	
	public String toString() {
		// return string representation of die: # of sides and current face
		return "# of Sides: " + sides + " | Current face: " + getFace();
	}
	
}
