package com.game.monopoly.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import mockit.Tested;

public class ResponseTest {

	@Tested
	private Response tested;
	
	@Test
	public void accessPlayerList() throws Exception {
		List<Player> players = new ArrayList<>();
		tested.setPlayers(players);
		assertThat(tested.getPlayers(), is(players));
	}
}
