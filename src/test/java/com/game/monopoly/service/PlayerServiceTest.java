package com.game.monopoly.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.game.monopoly.component.Dice;

import mockit.Injectable;
import mockit.Tested;

public class PlayerServiceTest {

	@Tested
	private PlayerService tested;

	@Injectable
	private Dice diceMock;

	@Test
	public void haveSpringServiceAnnotation() throws Exception {
		assertThat(PlayerService.class.getAnnotation(Service.class), notNullValue());
	}

	@Test
	public void rollDiceGivenPlayerAndRoundDetails() throws Exception {
		int player = 1;
		int round = 2;
		tested.rollDice(player, round);
		assertThat(diceMock.getFaceValue(), notNullValue());
	}

}
