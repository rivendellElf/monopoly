package com.game.monopoly.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import com.game.monopoly.MonopolyGameApplication;
import com.game.monopoly.model.GameSetup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes ={MonopolyGameApplication.class}, loader = SpringBootContextLoader.class)
public class MonopolySteps {
	
	@Autowired
	private TestRestTemplate template;
	
	private String numberOfPlayers;
	private  String numberOfRounds;
	private String responseMessage;
	private String player;
	private String currentPosition;
	private int diceValue;
	private int newPosition;
	
	private String url ="/api/game/monopoly";
	
	
	
	@Given("^the user is on Monopoly Game home page$")
	public void the_user_is_on_Monopoly_Game_home_page() throws Throwable {
	    
	}
	@When("^the player is (.*)$")
	public void the_player_is_Tom(String numberOfPlayers) throws Throwable {
		this.numberOfPlayers=numberOfPlayers;
	}
	@When("^the number of player is (.*)$")
	public void the_number_of_player_is(String numberOfPlayers) throws Throwable {
	  this.numberOfPlayers=numberOfPlayers;
	}
	@And("^the number of rounds is (.*)$")
	public void the_number_of_rounds_is(String numberOfRounds) throws Throwable {
	    this.numberOfRounds=numberOfRounds;
	}
	@When("^the url is POST$")
	public void the_url_is_url_POST() throws Throwable {
		HttpEntity<GameSetup> entity = new HttpEntity(buildGameSetup());
		System.out.println(template);
	    ResponseEntity<String> response = template.exchange(url, HttpMethod.POST, entity, String.class);
	    System.out.println("Gul" + response);
	}

	

	@Then("^the response is (.*)$")
	public void the_response_is(String responseMessage) throws Throwable {
	    this.responseMessage=responseMessage;
	}

	@When("^the current position is (.*)$")
	public void the_current_position_is(String currentPosition) throws Throwable {
		 this.currentPosition=currentPosition;
	}

	@When("^the dice value is (.*)$")
	public void the_dice_value_is_Success(int diceValue) throws Throwable {
	   this.diceValue=diceValue;
	}

	@Then("^the new Position is (.*)$")
	public void the_new_Position_is(int newPosition) throws Throwable {
	    this.newPosition=newPosition;
	}

	private GameSetup buildGameSetup(){
	 GameSetup game= new GameSetup();
	 game.setNumberOfPlayers(numberOfPlayers);
	 game.setNumberOfRounds(numberOfRounds);
	 game.setResponse(responseMessage);
	return game;
 
}
	}


