package com.game.monopoly;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mockit.Mocked;
import mockit.Tested;
import mockit.Verifications;

public class MonopolyGameApplicationTest {

	@Tested
	private MonopolyGameApplication tested;
	
	@Mocked
	private SpringApplication springApplicationMock;

	@Test
	public void haveSpringBootApplicationAnnotation() throws Exception {
		assertThat(MonopolyGameApplication.class.getAnnotation(SpringBootApplication.class), notNullValue());
	}

	@Test
	public void runSpringApplication() throws Exception {
		final String[] args = new String[] {};
		MonopolyGameApplication.main(args);
		new Verifications() {
			{
				SpringApplication.run(MonopolyGameApplication.class, args);
			}
		};
	}
}
