package Griffin_Ziegler_lab2;

// Represents different forms of currency

public enum Currency {
	// Types of USD currency represented as cents 
	HUNDREDS("Hundred Dollar Bills", "Hundred Dollar Bill", 10000), // Hundred dollar bill in cents
	TWENTIES("Twenty Dollar Bills", "Twenty Dollar Bill", 2000),
	TENS("Ten Dollar Bills", "Ten Dollar Bill", 1000), 
	FIVES("Five Dollar Bills", "Five Dollar Bill", 500),
	ONES("One Dollar Bills", "One Dollar Bill", 100),
	FIFTYCENTPCS("Fifty-cent pieces", "Fifty-cent piece", 50),
	DIMES("Dimes", "Dime", 10),
	NICKELS("Nickels", "Nickel", 5),
	PENNIES("Pennies", "Penny", 1);
	
	private final long centsValue;
	private final String pluralLabel;
	private final String singularLabel;
	// private final double value;
	
	private Currency(final String plural, final String singular, long centsValue) {
		this.centsValue = centsValue;
		this.pluralLabel = plural;
		this.singularLabel = singular;
	}
	
	public double getDollars() {
		// convert cents to dollars as a double
		return centsValue / 100.0;
	}
	
	public String getPlural() {
		// get plural label of currency
		return pluralLabel;
	}
	
	public String getSingular() {
		// get singular label of currency
		return singularLabel;
	}
	
	
}
