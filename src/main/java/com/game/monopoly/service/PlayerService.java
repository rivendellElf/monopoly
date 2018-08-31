package com.game.monopoly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.monopoly.component.Dice;

@Service
public class PlayerService {

	@Autowired
	private Dice dice;

	public void rollDice(int player, int round) {
		int firstDiceFaceValue = dice.getFaceValue();
		int secondDiceFaceValue = dice.getFaceValue();
	}

}
