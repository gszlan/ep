package org.gszlan.games.CardsWar;

public class Player {

	private String nickName;
	private Hand hand;
	private boolean stillInGame;
	
	public Player() {
		this.hand = new Hand();
		this.stillInGame = true;
	}
	
	public Player(String nickName) {
		this();
		this.nickName = nickName;
	}
	
	public Hand getHand() {
		return this.hand;
	}
	
	public void takeCard(String card) {
		this.getHand().addCard(card);
	}
	
	public boolean isStillInGame() {
		return this.stillInGame;
	}
	
	public void loose() {
		this.stillInGame = false;
	}
}
