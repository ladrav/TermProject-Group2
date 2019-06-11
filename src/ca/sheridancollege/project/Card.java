/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * 
 * 
 * Game chosen is War, a game that requires 2 players
 * Each player receives 26 cards in the beginning. 
 * The first player to win all 52 cards is the winner.
 * Modifier @ladrav June 10, 2019
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
        public enum Suit {HEARTS,CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private boolean isHigher = true;
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value cardVal)
        {
           suit =s;
           value= cardVal;
        }
	public Value getCardValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
    @Override
    public abstract String toString();
    
}