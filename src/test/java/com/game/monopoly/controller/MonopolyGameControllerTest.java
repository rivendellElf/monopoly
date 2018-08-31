package com.game.monopoly.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.monopoly.model.Monopoly;
import com.game.monopoly.service.PlayerService;

import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;

public class MonopolyGameControllerTest {

	@Tested
	private MonopolyGameController tested;

	@Injectable
	private PlayerService playerServiceMock;

	@Test
	public void haveRestControllerAnnotation() throws Exception {
		assertThat(MonopolyGameController.class.getAnnotation(RestController.class), notNullValue());
	}

	@Test
	public void haveRequestMappingAnnotation() throws Exception {
		assertThat(MonopolyGameController.class.getAnnotation(RequestMapping.class).value(),
				is(new String[] { "/api/game/monopoly" }));
	}

	@Test
	public void hasPostMappingAnnotation() throws Exception {
		assertThat(MonopolyGameController.class.getMethod("initiate", Monopoly.class).getAnnotation(PostMapping.class),
				notNullValue());
	}

	@Test
	public void intiateRoundGivenValidInputs() throws Exception {
		Monopoly setup = new Monopoly();
		setup.setNumberOfPlayers(4);
		setup.setNumberOfRounds(10);
		tested.initiate(setup);

		new Verifications() {
			{
				playerServiceMock.rollDiceAndCalculateNewPostion(anyInt, anyInt);
			}
		};
	}
}