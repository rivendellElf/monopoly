package com.game.monopoly.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.stereotype.Service;

import mockit.Tested;

public class PlayerServiceTest {

	@Tested
	private PlayerService tested;

	@Test
	public void haveSpringServiceAnnotation() throws Exception {
		assertThat(PlayerService.class.getAnnotation(Service.class), notNullValue());
	}
	
	@Test
	public void rollDiceGivenPlayerAndRoundDetails() throws Exception {
		
	}

}
