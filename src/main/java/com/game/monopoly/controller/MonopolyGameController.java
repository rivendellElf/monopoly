package com.game.monopoly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.monopoly.model.GameSetup;

@RestController
@RequestMapping("/api/game/monopoly")
public class MonopolyGameController {

	@PostMapping
	public ResponseEntity<GameSetup> setupGameForMonopoly(@RequestBody GameSetup gameSetup) {
		gameSetup.setResponse("success");
		return new ResponseEntity<GameSetup>(gameSetup, HttpStatus.OK);
	}
}