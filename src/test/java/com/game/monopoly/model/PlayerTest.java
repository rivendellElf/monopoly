package com.game.monopoly.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import mockit.Tested;

public class PlayerTest {

	@Tested
	private Player tested;

	@Test
	public void accessPlayerId() throws Exception {
		int playerId = 1;
		tested.setPlayerId(playerId);
		assertThat(tested.getPlayerId(), is(playerId));
	}

	@Test
	public void accessCurrentPosition() throws Exception {
		int currentPosition = 10;
		tested.setCurrentPosition(currentPosition);
		assertThat(tested.getCurrentPosition(), is(currentPosition));
	}

	@Test
	public void accessDie1FaceValue() throws Exception {
		int die1FaceValue = 5;
		tested.setDie1FaceValue(die1FaceValue);
		assertThat(tested.getDie1FaceValue(), is(die1FaceValue));
	}

	@Test
	public void accessDie2FaceValue() throws Exception {
		int die2FaceValue = 5;
		tested.setDie1FaceValue(die2FaceValue);
		assertThat(tested.getDie1FaceValue(), is(die2FaceValue));
	}
}
