package org.gszlan.games.CardsWar;

import org.junit.*;

public class HandTest {

	@Test
	public void add_one_card_to_empty_hand() {
		Hand hand = new Hand();
		hand.addCard("2h");
		
		Assert.assertEquals(1, hand.getNumberOfCards());
	}
	
	@Test
	public void get_top_card() {
		Hand hand = new Hand();
		hand.addCard("2h");
		hand.addCard("Ac");
		
		Assert.assertEquals("2h", hand.getTopCard());
	}
	
	@Test
	public void hand_with_2_cards_left_should_have_6_cards_after_winning_pot_with_4_cards() {
		Hand hand = new Hand();
		hand.addCard("2h");
		hand.addCard("Ac");
		Hand pot = new Hand();
		pot.addCard("5s");
		pot.addCard("Jh");
		pot.addCard("Qc");
		pot.addCard("2d");
		
		hand.addPot(pot);
		Assert.assertEquals(6, hand.getNumberOfCards());
	}
	
	@Test
	public void first_card_in_pot_should_be_the_last_one_in_hand_after_pot_is_added_to_the_hand() {
		Hand hand = new Hand();
		Hand pot = new Hand();
		pot.addCard("5s");
		pot.addCard("Jh");
		
		hand.addPot(pot);
		Assert.assertTrue(hand.getTopCard().startsWith("Jh"));
	}
}
