package com.game.monopoly.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
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

	private List<Player> playerList = new ArrayList<>();

	@Before
	public void setup() {
		Player player = new Player();
		player.setCurrentPosition(12);
		player.setDie1FaceValue(5);
		player.setDie2FaceValue(3);
		player.setPlayerId(1);
		playerList.add(player);
	}

	@Test
	public void haveSpringServiceAnnotation() throws Exception {
		assertThat(PlayerService.class.getAnnotation(Service.class), notNullValue());
	}

	@Test
	public void rollDiceGivenPlayerAndRoundDetails() throws Exception {
		int player = 1;
		tested.rollDiceAndCalculateNewPostion(player, playerList);
		assertThat(diceMock.getFaceValue(), notNullValue());
	}

	@Test
	public void returnNewPlayerGivenFirstRound() throws Exception {
		int player = 2;
		tested.rollDiceAndCalculateNewPostion(player, playerList);
		assertThat(diceMock.getFaceValue(), notNullValue());
	}

	@Test
	public void returnNewPositionGivenCurrentPostionGreaterThanFourty() throws Exception {
		int player = 2;
		Player p = new Player();
		p.setCurrentPosition(39);
		p.setDie1FaceValue(5);
		p.setDie2FaceValue(6);
		p.setPlayerId(1);
		playerList.add(p);
		tested.rollDiceAndCalculateNewPostion(player, playerList);
		assertThat(diceMock.getFaceValue(), notNullValue());
	}

}
