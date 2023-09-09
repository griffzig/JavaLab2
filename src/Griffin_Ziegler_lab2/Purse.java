package Griffin_Ziegler_lab2;

//holds an amount of each type of currency

public class Purse {
	private int hundreds, twenties, tens,
				fives, ones, fiftyCentPcs,
				dimes, nickels, pennies;
	public double cashTotal;
	
	
	public Purse() {
		// Constructor
		
	}
	
	/* Getters and setters for Currency types
	 * public void setCurrencyTypeVal() {}
	 * 		- set the monetary total of each type in the purse
	 * 
	 * public double getCurrencyTypeVal() {}
	 * 		- get the monetary amount of a single note or coin
	 */
	

	// hundred dollar bills
	public void setHundredsVal(int totalHundreds) {
		this.hundreds = totalHundreds;
	}
	
	public double getHundredsVal() {
		return Currency.HUNDREDS.getDollars() * hundreds;
	}
	
	// twenty dollar bills
	public void setTwentiesVal(int totalTwenties) {
		this.twenties = totalTwenties;
	}
	
	public double getTwentiesVal() {
		return Currency.TWENTIES.getDollars() * twenties;
	}
	
	// ten dollar bills
	public void setTensVal(int totalTens) {
		this.tens = totalTens;
	}
	
	public double getTensVal() {
		return Currency.TENS.getDollars() * tens;
	}
	
	// five dollar bills
	public void setFivesVal(int totalFives) {
		this.fives = totalFives;
	}
	
	public double getFivesVal() {
		return Currency.FIVES.getDollars() * fives;
	}
	
	// one dollar bills
	public void setOnesVal(int totalOnes) {
		this.ones = totalOnes;
	}
	
	public double getOnesVal() {
		return Currency.ONES.getDollars() * ones;
	}
	
	// fifty-cent pieces
	public void setFiftyCentPcsVal(int totalFiftyCentPcs) {
		this.fiftyCentPcs = totalFiftyCentPcs; 
	}
	
	public double getFiftyCentPcsVal() {
		return Currency.FIFTYCENTPCS.getDollars() * fiftyCentPcs;
	}
	
	// dimes
	public void setDimesVal(int totalDimes) {
		this.dimes = totalDimes;
	}
	
	public double getDimesVal() {
		return Currency.DIMES.getDollars() * dimes;
	}
	
	// nickels
	public void setNickelsVal(int totalNickels) {
		this.nickels = totalNickels;
	}
	
	public double getNickelsVal() {
		return Currency.NICKELS.getDollars() * nickels;
	}
	
	// pennies
	public void setPenniesVal(int totalPennies) {
		this.pennies = totalPennies;
	}
	
	public double getPenniesVal() {
		return Currency.PENNIES.getDollars() * pennies;
	}
	
	public double cashTotal() {
		// compute the total amount of money
		return cashTotal = getHundredsVal() + getTwentiesVal() + getTensVal() +
					getFivesVal() + getOnesVal() + getFiftyCentPcsVal() +
					getDimesVal() + getNickelsVal() + getPenniesVal();
	}
	
}
