package com.game.monopoly.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import mockit.Tested;

public class MonopolyTest {

	@Tested
	private Monopoly tested;

	@Test
	public void accessNoOfPlayers() throws Exception {
		int noOfPlayers = 4;
		tested.setNumberOfPlayers(noOfPlayers);
		assertThat(tested.getNumberOfPlayers(), is(noOfPlayers));
	}

	@Test
	public void accessNoOfRounds() throws Exception {
		int noOfRounds = 4;
		tested.setNumberOfRounds(noOfRounds);
		assertThat(tested.getNumberOfRounds(), is(noOfRounds));
	}

	@Test
	public void accessResponse() throws Exception {
		Response response = new Response();
		tested.setResponse(response);
		assertThat(tested.getResponse(), is(response));
	}
}
