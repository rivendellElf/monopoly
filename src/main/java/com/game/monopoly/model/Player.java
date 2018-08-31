package com.game.monopoly.model;

import java.io.Serializable;

public class Player implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String playerId;
	private byte currentPosition;
	private byte die1FaceValue;
	private byte die2FaceValue;
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public byte getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(byte currentPosition) {
		this.currentPosition = currentPosition;
	}
	public byte getDie1FaceValue() {
		return die1FaceValue;
	}
	public void setDie1FaceValue(byte die1FaceValue) {
		this.die1FaceValue = die1FaceValue;
	}
	public byte getDie2FaceValue() {
		return die2FaceValue;
	}
	public void setDie2FaceValue(byte die2FaceValue) {
		this.die2FaceValue = die2FaceValue;
	}
	
	
}
