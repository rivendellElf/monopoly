@Player
Feature: Monopoly Play Game

Scenario Outline: Join Monopol Game
	Given the user is on Monopoly Game home page  
	When  the number of player is <numberOfPlayers>
	And   the number of rounds is <numberOfRounds>
	And   the url is POST
    Then  the response is <responseMessage>  
	
	Examples: 
		 |numberOfPlayers|numberOfRounds|responseMessage|
		 | 8             |  20          |  success      |
		 | 11            |  9           |  success      |
	
		 
		 
		 
		 