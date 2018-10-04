package org.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",plugin= {"json:target/cucumber-reports/Cucumber.json"})

public class TestRunner 
{

}
