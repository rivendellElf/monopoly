@Player
Feature: Monopoly Play Game

Scenario Outline: Join Monopol Game
	Given the user is on Monopoly Game home page  
	When the number of player is <numberOfPlayers>
	And the number of rounds is <numberOfRounds>
    Then the response is <responseMessage>  
	
	Examples: 
		|numberOfPlayers|numberOfRounds|responseMessage|
		| 8             |  20          |  Success      |
		|               |              |               |
		
@Actions		
Scenario Outline: Join Monopol Game
	Given the user is on Monopoly Game home page  
	When the player is <player>
	And the current position is <currentPosition>
    And the dice value is <diceValue>   
    Then the new Position is <newPosition> 


    
	
	Examples: 
		|player|currentPosition|diceValue      |newPosition|
		| 10   |  8            |  Success      |           |
	