package Griffin_Ziegler_lab2;

import java.util.*;

// represents a collection of cards

public class Hand {
	
	// declare list representation of a hand
	private final List<Card> hand;
	
	public Hand(List<Card> hand) {
		// Constructor
		this.hand = hand;
	}
	
	// create a new Hand object 
	public static Hand getHand() {
		return new Hand(new ArrayList<Card>());
	}
	
	// add a card to the hand
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public String displayHand() {
		// return a string representation of the cards in the hand
		// initialize temp list
		List<Card> temp = hand;
		
		// instantiate stringbuilder object to store strings of the cards
		StringBuilder sb = new StringBuilder();
		
		// use for each loop to add strings 
		for (Card card : temp) {
			sb.append(card);
		}
		
		// return string representation
		return sb.toString();
	}
	

}
