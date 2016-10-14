package org.gszlan.games.CardsWar;

public class Card {

	public static String[] CARD_RANKS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public static String[] CARD_COLORS = {"h", "d", "s", "c"};

public static int getCardRank(String card) {
	int rank = -1;
	String cardValue = card.substring(0, card.length()-1);
	
	for (int i = 0 ; i < CARD_RANKS.length; i++ ) {
		if (cardValue.equals(CARD_RANKS[i])) {
			rank = i;
			break;
		}
	}
	return rank;
}

}
