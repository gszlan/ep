package org.gszlan.games.CardsWar;

import java.util.List;

public class Showdown {

	private Hand pot = new Hand();
	
	public static String findWinningHand(String hand1, String hand2) {
		return (Card.getCardRank(hand1) > Card.getCardRank(hand2)) ? hand1 : hand2;
	}
	
	public void collectPot(Hand hand1, Hand hand2) {
		pot.addCard(hand1.getTopCard());
		pot.addCard(hand2.getTopCard());
	}
	
	public void collectPotFromActivePlayers(List<Player> activePlayers) {
		for (Player eachPlayer : activePlayers) {
			pot.addCard(eachPlayer.getHand().getTopCard());
		}
	}
	
	public Hand getPot() {
		return pot;
	}
}
