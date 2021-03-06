package com.techelevator.monopoly;

public class Player {

	// POJO
	// Plain Ol' Java Object
	
	private int playerNumber;
	private String playingPiece;
	private boolean isBankrupt;

	public Player(int playerNumber, String playingPiece) {
		this.playerNumber = playerNumber;
		this.playingPiece = playingPiece;
		this.isBankrupt = false;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public String getPlayingPiece() {
		return playingPiece;
	}

	public boolean isBankrupt() {
		return isBankrupt;
	}

	public void goBankrupt() {
		this.isBankrupt = true;
	}

	@Override
	public String toString() {
		return "Player " + playerNumber + " : " + playingPiece;
	}
}
