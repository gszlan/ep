package org.gszlan.games.CardsWar;

import java.util.ArrayList;
import java.util.List;

public class Game {

	List<Player> allPlayers = new ArrayList<Player>();

	public void addPlayer(Player player) {
		this.allPlayers.add(player);
	}
	
	public Player getPlayer(int playerIndex) {
		return this.allPlayers.get(playerIndex);
	}

	public List<Player> getActivePlayers() {
		
		List<Player> activePlayers = new ArrayList<Player>();
		for (Player each : allPlayers) {
			if (each.isStillInGame())
				activePlayers.add(each);
		}
		return activePlayers;
	}
	
	public int getNumberOfActivePlayers() {
		return getActivePlayers().size();
	}
	
}
