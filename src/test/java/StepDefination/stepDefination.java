package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	WebDriver driver;
	@Given("I landed in Ecommerce Page")
	public void i_landed_in_Ecommerce_Page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\offic\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.get("https://www.saucedemo.com");
	   
	}

	@When("Logged with valid username and password")
	public void logged_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	  
	}

	@Then("Dashboard logo is displayed")
	public void dashboard_logo_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		boolean logo =driver.findElement(By.cssSelector(".app_logo")).isDisplayed();
		Assert.assertTrue(logo);
		driver.close();
	   
	}

}
