package appRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\login.feature"},
		glue= {"stepDefinitions","appRunner","Hooks"},
		stepNotifications = true
				//plugin = { "pretty", "html:target/cucumber-reports" }
		//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" }
		
		
		
		
		)





public class MyRunner {
	
	

}
