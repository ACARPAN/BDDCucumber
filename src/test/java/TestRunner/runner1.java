package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class runner1 {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefination" }, plugin = {
			"json:target/cucumber.json" })
	public class TestRunner {

	}

}
