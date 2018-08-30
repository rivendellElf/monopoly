
package com.game.monopoly.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin ="html:target/cucumber-reports",
		features = "src/test/resources/features",
        glue="com.game.monopoly.steps",
         tags = "@Player")



public class CucumberRunner{
	

}

