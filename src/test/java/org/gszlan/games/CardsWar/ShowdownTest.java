package org.gszlan.games.CardsWar;

import java.util.concurrent.BlockingDeque;

import org.junit.*;

public class ShowdownTest {

	@Test
	public void aceHearts_shoud_win_against_tenSpades() {
		String card1 = "Ah";
		String card2 = "10s";
		
		Assert.assertEquals("Ah", Showdown.findWinningHand(card1, card2));
	}
	
	@Test
	public void twoDiamonds_should_loose_against_fiveClubs() {
		String card1 = "2d";
		String card2 = "5c";
		
		Assert.assertEquals("5c", Showdown.findWinningHand(card1, card2));
	}
	
	@Test
	public void collect_pot_from_2_players() {
		
		Showdown showdown = new Showdown();
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		hand1.addCard("5s");
		hand2.addCard("Jh");
		showdown.collectPot(hand1, hand2);
		
		Assert.assertEquals(0, showdown.getPot().toString().compareTo("[5s, Jh]"));
	}
	
	@Test
	public void collect_pot_from_all_players() {
		
		Showdown showdown = new Showdown();
		Game game = new Game();
		Player player1 = new Player("player1");
		player1.getHand().addCard("3s");
		Player player2 = new Player("player2");
		player2.getHand().addCard("Kh");
		Player player3 = new Player("player3");
		player3.getHand().addCard("As");
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		
		showdown.collectPotFromActivePlayers(game.getActivePlayers());
		Assert.assertEquals(0, showdown.getPot().toString().compareToIgnoreCase("[3s, Kh, As]"));
	}
	
}
