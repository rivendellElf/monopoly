package com.game.monopoly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.monopoly.component.Dice;
import com.game.monopoly.model.Player;

@Service
public class PlayerService {

	@Autowired
	private Dice dice;

	public void rollDiceAndCalculateNewPostion(int playerId, List<Player> players) {
		int firstDiceValue = dice.getFaceValue();
		int secondDiceValue = dice.getFaceValue();
		int flag = 0;
		for (Player t : players) {
			if (t.getPlayerId() == playerId) {
				t.setDie1FaceValue(firstDiceValue);
				t.setDie2FaceValue(secondDiceValue);
				if (t.getCurrentPosition() + t.getDie1FaceValue() + t.getDie2FaceValue() > 40) {
					t.setCurrentPosition((t.getCurrentPosition() + t.getDie1FaceValue() + t.getDie2FaceValue()) % 40);
				} else {
					t.setCurrentPosition(t.getCurrentPosition() + t.getDie1FaceValue() + t.getDie2FaceValue());
				}
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			Player player = new Player();
			player.setDie1FaceValue(firstDiceValue);
			player.setDie2FaceValue(secondDiceValue);
			player.setPlayerId(playerId);
			player.setCurrentPosition(
					player.getCurrentPosition() + player.getDie1FaceValue() + player.getDie2FaceValue());
			players.add(player);
		}
	}
}
