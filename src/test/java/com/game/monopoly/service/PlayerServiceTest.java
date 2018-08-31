package com.game.monopoly.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.game.monopoly.component.Dice;
import com.game.monopoly.model.Player;

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
		List<Player> playerList = new ArrayList<>();
		tested.rollDiceAndCalculateNewPostion(player, playerList);
		assertThat(diceMock.getFaceValue(), notNullValue());
	}

}
