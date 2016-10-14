package org.gszlan.games.CardsWar;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand {

	private List<String> allCardsInHand;
	
	public Hand() {
		allCardsInHand = new ArrayList<String>();
	}
	
	public void addCard(String card) {
		allCardsInHand.add(card);
	}
	
	public void addPot(Hand hand) {
		hand.reverseCardsInHand();
		this.allCardsInHand.addAll(hand.getAllCardsInHand());
	}
	
	public List<String> getAllCardsInHand() {
		return this.allCardsInHand;
	}
	
	public void reverseCardsInHand() {
		Collections.reverse(allCardsInHand);
	}
	
	public int getNumberOfCards() {
		return allCardsInHand.size();
	}
	
	public String getTopCard() {
		String card;
		card = allCardsInHand.get(0);
		allCardsInHand.remove(0);
		return card;
	}
	
	public String toString() {
		return this.allCardsInHand.toString();
	}
}
