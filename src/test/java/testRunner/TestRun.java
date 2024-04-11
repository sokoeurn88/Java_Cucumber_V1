package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="//Features/Login.feature",
		glue="stepDefinitions",
		dryRun=false,		//check the fature file has corresponding method
		monochrome=true, 	//remove unreadable character inside console window
		plugin= {
				"pretty",
				"html:test-output"}
		
		)




public class TestRun {

}
