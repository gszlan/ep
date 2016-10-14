package org.gszlan.games.CardsWar;

import org.junit.*;

public class GameTest {

	@Test
	public void tree_new_players_should_be_active() {
		Game game = new Game();
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		Player player3 = new Player("player3");
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		
		Assert.assertEquals(3, game.getActivePlayers().size());
	}
	
	@Test
	public void two_players_but_only_one_should_be_active() {
		Game game = new Game();
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		game.addPlayer(player1);
		game.addPlayer(player2);
		player2.loose();
		
		Assert.assertEquals(1, game.getActivePlayers().size());
	}
}
