package Griffin_Ziegler_lab2;

// represents a cash register
// import lab2.register.Purse;

public class Register {
	
	// Declare variables
	double registerDefault = 528.2; // original amt of cash in the register
	double registerTotal; // total amt of cash in the register
	double moneyIn; // amt of cash going in, aka purchase made
	// double change; // amt of change to return to customer
	
	private int hundreds, twenties, tens, fives, ones,
		fiftyCentPcs, dimes, nickels, pennies;
	/* Create new Purse object "r" to represent
	 * the amount of starting money in the register 
	 */
	Purse r = new Purse();
	
	/* Create new Purse object "p" to represent
	 * the purchase made
	 */
	Purse p = new Purse();
	
	
	public Register() {
		// Constructor
		// return register to original state
		restock();
	}
	
	
	public double restock() {
		// returns register to original state
		double cashOut;
		
		registerTotal = r.cashTotal();
		
		// reset register
		r.setHundredsVal(0);
		r.setTwentiesVal(10);
		r.setTensVal(20);
		r.setFivesVal(20);
		r.setOnesVal(20);
		r.setFiftyCentPcsVal(10);
		r.setDimesVal(20);
		r.setNickelsVal(20);
		r.setPenniesVal(20);
		
		
		// find the balance of what was taken out
		cashOut = registerTotal - registerDefault;
		
		return cashOut;
	}
	
	Purse makeChange(Purse cashIn, double price) {
		// make the purchase
		// cashIn = amt of money in purse / declared in main?
		// price = price of sale / declared in main?
		Purse change = new Purse();
		
		// declare ints to represent change to give back
		int hundredsInChange = 0, twentiesInChange = 0, tensInChange = 0,
			fivesInChange = 0, onesInChange = 0, fiftyCentsInChange = 0,
			dimesInChange = 0, nickelsInChange = 0, penniesInChange = 0;
		
		
		if (cashIn.cashTotal() < price) {
			return cashIn;
		} else {
			// put the money from the purse into the register
			hundreds += cashIn.getHundredsVal();
			twenties += cashIn.getTwentiesVal();
			tens += cashIn.getTensVal();
			fives += cashIn.getFivesVal();
			ones += cashIn.getOnesVal();
			fiftyCentPcs += cashIn.getFiftyCentPcsVal();
			dimes += cashIn.getDimesVal();
			nickels += cashIn.getNickelsVal();
			pennies += cashIn.getPenniesVal();
			
			// get the change
			hundreds -= hundredsInChange;
			twenties -= twentiesInChange;
			tens -= tensInChange;
			fives -= fivesInChange;
			ones -= onesInChange;
			fiftyCentPcs -= fiftyCentsInChange;
			dimes -= dimesInChange;
			nickels -= nickelsInChange;
			pennies -= penniesInChange;
			
			
			// hand change back to customer
			change.setHundredsVal(hundredsInChange);
			change.setTwentiesVal(twentiesInChange);
			change.setTensVal(tensInChange);
			change.setFivesVal(fivesInChange);
			change.setOnesVal(onesInChange);
			change.setFiftyCentPcsVal(fiftyCentsInChange);
			change.setDimesVal(dimesInChange);
			change.setNickelsVal(nickelsInChange);
			change.setPenniesVal(penniesInChange);
			
			
			// return new Purse with change
			return change;
			
		}
		
	}
	
	public double empty() {
		// set currency to 0
		registerTotal = r.cashTotal();
		
		return registerTotal; 
	}
	
	public double getRegisterTotal() {
		return registerTotal;
	}
}
