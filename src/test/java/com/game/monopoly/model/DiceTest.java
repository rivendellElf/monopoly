package com.game.monopoly.model;

import org.junit.Test;

import com.game.monopoly.component.Dice;

import mockit.Tested;

public class DiceTest {

	@Tested
	private Dice tested;

	@Test
	public void returnFaceValueWhenDiceIsRolled() throws Exception {
		tested.getFaceValue();
	}
}