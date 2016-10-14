package org.gszlan.games.CardsWar;

import org.junit.*;

public class CardTest {

	@Test
	public void cardValue_two_should_give_rank_0() {
		String cardValue = "2d";
		Assert.assertEquals(0, Card.getCardRank(cardValue));
	}
	
	@Test
	public void invalid_cardValue_should_give_rank_minusone() {
		String cardValue = "2cc";
		Assert.assertEquals(-1, Card.getCardRank(cardValue));
	}
	
	@Test
	public void cardValue_ten_should_give_rank_8() {
		String cardValue = "10h";
		Assert.assertEquals(8, Card.getCardRank(cardValue));
	}
	
	@Test
	public void cardValue_king_should_give_rank_11() {
		String cardValue = "Ks";
		Assert.assertEquals(11, Card.getCardRank(cardValue));
	}
}
