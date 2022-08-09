package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Config.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class appHooks {
	
	
	
	@Before("@Second")
	public void getbeforeTest() {
		System.out.println("Run before");
	}
	
	
	@Before("priority=0")
	public void test1() {
		
	}
	
	@Before("priority=1")
	public void test2() {
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
	
	}
	
	@BeforeStep
	public void getbeforemethod() {
	
		System.out.println("Run before step");
	}
	
	
	@After
	public void getAfterTest() {
		System.out.println("Run After");
	}

}
