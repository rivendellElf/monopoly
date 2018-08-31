package com.game.monopoly.model;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 1L;

	private int playerId;
	private int currentPosition = 1;
	private int die1FaceValue;
	private int die2FaceValue;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public int getDie1FaceValue() {
		return die1FaceValue;
	}

	public void setDie1FaceValue(int die1FaceValue) {
		this.die1FaceValue = die1FaceValue;
	}

	public int getDie2FaceValue() {
		return die2FaceValue;
	}

	public void setDie2FaceValue(int die2FaceValue) {
		this.die2FaceValue = die2FaceValue;
	}

}
