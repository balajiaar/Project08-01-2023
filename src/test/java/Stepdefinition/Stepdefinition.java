package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
 WebDriver driver;
	@Given("user should be in adactin page")
	public void user_should_be_in_adactin_page() throws Throwable{ 
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
	    
	}

	@When("user should enter the valid {string} and {string}")
	public void user_should_enter_the_valid_and(String userName, String passWord) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys(userName);
	    driver.findElement(By.id("password")).sendKeys(passWord);
	    
	}

	@When("user should press the login button")
	public void user_should_press_the_login_button() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	   
	}
	@Then("user should receive the login sucess message{string}")
	public boolean user_should_receive_the_login_sucess_message(String string)throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   boolean words=driver.findElement(By.xpath("//input[@value='Hello Naveenaso!']")).isDisplayed();
	  return words;

}
}