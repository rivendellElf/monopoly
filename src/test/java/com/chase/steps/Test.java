package com.chase.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	private int numberOfPlayers;
	private  int numberOfRounds;
	private String responseMessage;
	private String player;
	private int currentPosition;
	private int diceValue;
	private int newPosition;
	
	@Given("^the user is on Monopoly Game home page$")
	public void home_Pages() throws Throwable {
	   
	}

	@When("^the number of player is (.*)$")
	public void the_number_of_player_is(int numberOfPlayers) throws Throwable {
	    this.numberOfPlayers=numberOfPlayers;
	}

	@And("^the number of rounds is (.*)$")
	public void the_number_of_rounds_is(int numberOfRounds) throws Throwable {
	    this.numberOfRounds=numberOfRounds;
	}

	@Then("^the response is (.*)$")
	public void the_response_is(String responseMessage) throws Throwable {
	    this.responseMessage=responseMessage;
	}
	@When("^the player is (\\d+)$")
	public void the_player_contains_is(String player) throws Throwable {
	    this.player=player;
	}

	@When("^the current position is (\\d+)$")
	public void the_current_position_is(int currentPosition) throws Throwable {
	   this.currentPosition=currentPosition;
	}

	@When("^the dice value is (\\d+)$")
	public void the_dice_value_is_Success(int diceValue) throws Throwable {
	   this.diceValue=diceValue;
	}

	@Then("^the new Position is (\\d+)$")
	public void the_new_Position_is(int newPosition) throws Throwable {
	    this.newPosition=newPosition;
	}


}
