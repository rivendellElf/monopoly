package com.game.monopoly.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.monopoly.model.Monopoly;
import com.game.monopoly.model.Player;
import com.game.monopoly.model.Response;
import com.game.monopoly.service.PlayerService;

@RestController
@RequestMapping("/api/game/monopoly")
public class MonopolyGameController {

	@Autowired
	private PlayerService playerService;

	@PostMapping
	public ResponseEntity<Monopoly> initiate(@RequestBody Monopoly monopoly) {

		List<Player> players = new ArrayList<>();
		IntStream.range(1, monopoly.getNumberOfRounds() + 1).forEach(round -> {
			IntStream.range(1, monopoly.getNumberOfPlayers() + 1).forEach(player -> {
				playerService.rollDiceAndCalculateNewPostion(player, players);
			});
		});
		Response response = new Response();
		response.setPlayers(players);
		monopoly.setResponse(response);
		return new ResponseEntity<>(monopoly, HttpStatus.OK);
	}

}