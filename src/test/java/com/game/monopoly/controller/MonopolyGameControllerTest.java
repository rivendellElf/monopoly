package com.game.monopoly.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mockit.Tested;

public class MonopolyGameControllerTest {

	@Tested
	private MonopolyGameController tested;

	@Test
	public void haveRestControllerAnnotation() throws Exception {
		assertThat(MonopolyGameController.class.getAnnotation(RestController.class), notNullValue());
	}

	@Test
	public void haveRequestMappingAnnotation() throws Exception {
		assertThat(MonopolyGameController.class.getAnnotation(RequestMapping.class).value(),
				is(new String[] { "/api/game/monopoly" }));
	}
}