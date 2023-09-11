package Griffin_Ziegler_lab2;

import java.util.*;

// represents a full deck of 52 playing cards

public class Deck {
	
	// Declare list representation
	private List<Card> deck;
	
	public Deck() {
		// Constructor 
		deck = new ArrayList<Card>(); // initialize deck ArrayList
		// add 52 cards to the deck upon construction
		for (int i = 0; i < 52; i++) {
			deck.add(Card.addCard());
		}
		
		// shuffle the deck upon construction
		for (int j = 0; j < 7; j++) {
			Collections.shuffle(deck);
		}
	}
	
	public Card draw() {
		// draw a single (random) card from the deck
		// initialize random class
		Random rand = new Random();
		
		// generate random index
		int index = rand.nextInt(deck.size());
		
		// return random card
		return deck.get(index);
		
	}
	
	List<Card> deal(int numberOfCards) {
		// deal a certain # of (random) cards from the deck
		// initialize random class
		Random rand = new Random();
		
		// declare & initialize list for random cards
		List<Card> randomCards;
		randomCards = new ArrayList<Card>(numberOfCards);
		
		for (int i = 0; i < randomCards.size(); i++) {
			// generate random index
			int index = rand.nextInt(deck.size());
			// add random cards to hand
			randomCards.add(deck.get(index));
		}
		
		return randomCards;
	}
	
	public void renewDeck() {
		// bring deck back to initial state (before cards have been dealt)
		Collections.sort(deck);
	}

}
