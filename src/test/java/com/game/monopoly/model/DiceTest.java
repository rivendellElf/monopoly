package com.game.monopoly.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.game.monopoly.component.Dice;

import mockit.Tested;

public class DiceTest {

	@Tested
	private Dice tested;

	private static final Integer MAX_VALUE = 6;

	private static final Integer MIN_VALUE = 1;

	@Test
	public void returnFaceValueWhenDiceIsRolled() throws Exception {
		assertTrue(tested.getFaceValue() <= MAX_VALUE);
		assertTrue(tested.getFaceValue() >= MIN_VALUE);
	}
}