@wip
Feature: Amozon sign in home page

Scenario: Email field shoul displayed
    Given I am on facebook homepage
    When I login as a client
    When  I should be able verify login
    Then I should to see my email ="gdsahk@gmail.com";
    
