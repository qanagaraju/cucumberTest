package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Config.BrowserDriver;
import appElements.LoginPageObjects;
import appUtils.PropertyLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginService {
	
	WebDriver driver;
	LoginPageObjects loginpage;
	PropertyLoader prop = new PropertyLoader();

	@Given("user start home page")
	public void user_start_home_page() {
		
		BrowserDriver.getCurrentDriver(prop.getbrowsername()).get(prop.getappurl());
		
	}
	
	



	@When("user insert username and password")
	public void user_insert_username_and_password() throws IOException {
	   
		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
		loginpage.insertUserName(prop.getusername()).insertPassword(prop.getpassword());
		
	}


	
	@Then("user click submit button")
	public void user_click_submit_button() throws IOException {
		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
		loginpage.clickSubmit();
		
	}
	
	@Then("user click signout button")
	public void user_click_signout_button() throws IOException {
	    
		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
		loginpage.clicklogout();
	}






	
	@Then("user close browser")
	public void user_close_browser() {
	    
		BrowserDriver.getCurrentDriver().close();
		
	}



	

}
