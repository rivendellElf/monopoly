
package com.aliexpress.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin ="html:target/cucumber-reports",
		features = "src/test/resources/features/Play_Game.feature",
        glue="com.chase.steps",
         tags = "@Actions",
         dryRun=true)
public class CukesRunner{
	

}

