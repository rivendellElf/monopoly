package com.game.monopoly.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import mockit.Tested;

public class DiceTest {

	@Tested
	private Dice tested;

	@Test
	public void accessFaceValue() throws Exception {
		int faceValue = 1;
		Dice dice = new Dice();
		dice.setFaceValue(faceValue);
		assertThat(dice.getFaceValue(), is(1));
	}
}