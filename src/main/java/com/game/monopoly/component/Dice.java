package com.game.monopoly.component;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Dice {

	private static Random random = new Random();
	private static final Integer MAX_VALUE = 6;
	private static final Integer MIN_VALUE = 1;

	public int getFaceValue() {
		return random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
	}
}