Feature: As a User, I want to use google translate 
so that I can translate a text to a different language

Scenario: Translate a single word
      Given  On Google translate page
      When I choose sourse language
      And I choose target language
      And I type a word into source field
      And I click on translate
      Then Translation is displayed
      