package com.game.monopoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.monopoly.model.GameSetup;
import com.game.monopoly.service.PlayerService;

@RestController
@RequestMapping("/api/game/monopoly")
public class MonopolyGameController {

	@Autowired
	private PlayerService playerService;

	@PostMapping
	public ResponseEntity<?> initiate(@RequestBody GameSetup gameSetup) {

		for (int i = 1; i <= gameSetup.getNumberOfRounds(); i++) {
			for (int j = 1; j <= gameSetup.getNumberOfPlayers(); j++) {
				playerService.rollDice(j, i);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}