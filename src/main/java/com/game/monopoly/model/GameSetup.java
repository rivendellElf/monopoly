package com.game.monopoly.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class GameSetup implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numberOfPlayers;
	private String numberOfRounds;
	private String response;

	public String getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(String numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getNumberOfRounds() {
		return numberOfRounds;
	}

	public void setNumberOfRounds(String numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}