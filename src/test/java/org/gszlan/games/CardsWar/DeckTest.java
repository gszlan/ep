package org.gszlan.games.CardsWar;

import org.junit.*;

public class DeckTest {

	Deck deck = new Deck();
	Game game = new Game();

	@Test
	public void new_deck_should_have_52_cards() {
		Assert.assertEquals(52, deck.getNumberOfCards());
	}
	
	@Test
	public void check_first_free_cards_in_new_deck() {
		Assert.assertTrue(deck.toString().startsWith("[2h, 2d, 2s, "));
	}
	
	@Test
	public void shuffle_new_deck_and_check_first_three_cards() {
		deck.schuffle();
		Assert.assertFalse(deck.toString().startsWith("[2h, 2d, 2s, "));
	}
	
	@Test
	public void deck_should_be_empty_after_dealing_cards_to_all_players() {
		dealCardsToPlayers(4);
		Assert.assertEquals(0, deck.getNumberOfCards());
	}
	
	@Test
	public void after_dealing_unschuffled_cards_to_four_players_check_first_player_first_free_cards() {
		dealCardsToPlayers(4);
		Assert.assertTrue(game.getActivePlayers().get(0).getHand().toString().startsWith("[2h, 3h, 4h, "));
	}
	
	@Test
	public void deal_cards_to_three_players_and_check_how_many_cards_first_player_received() {
		dealCardsToPlayers(3);
		Assert.assertEquals(18, game.getPlayer(0).getHand().getNumberOfCards());
	}
	
	@Test
	public void deal_cards_to_three_players_and_check_how_many_cards_second_player_received() {
		dealCardsToPlayers(3);
		Assert.assertEquals(17, game.getPlayer(1).getHand().getNumberOfCards());
	}
	
	private void dealCardsToPlayers(int numberOfPlayers) {
		
		for ( ; numberOfPlayers > 0 ; numberOfPlayers--) {
			Player player = new Player();
			game.addPlayer(player);
		}
		deck.dealCardsToPlayers(game.getActivePlayers());
	}
}
