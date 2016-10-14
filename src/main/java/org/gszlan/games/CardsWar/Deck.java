package org.gszlan.games.CardsWar;

import java.util.Collections;
import java.util.List;

public class Deck extends Hand {

	public Deck() {
		super();
		addAllCards();
	}
	
	public void addAllCards() {
		for( String cardRank : Card.CARD_RANKS) {
			for (String cardColour : Card.CARD_COLORS) {
				this.addCard(cardRank + cardColour);
			}
		}
	}
	
	public void schuffle() {
		Collections.shuffle(getAllCardsInHand());
	}
	
	public void dealCardsToPlayers(List<Player> players) {
		
		for (int i = 0 ; this.getNumberOfCards() > 0 ; i++) {
			players.get(i % players.size()).takeCard(this.getTopCard());
		}
	}
}
