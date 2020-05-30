package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSingleData {
	WebDriver driver;
	@When("^I open OrangeHRMS URL on chrome$")
	public void i_open_OrangeHRMS_URL_on_chrome() throws Throwable {
	    driver=new ChromeDriver();
	    driver.get("http://orangehrm.qedgetech.com/");
	    driver.manage().window().maximize();
	}

	@When("^I enter username in  and password$")
	public void i_enter_username_in_and_password() throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
	    
	}

	@Then("^Verify dash text contains in url$")
	public void verify_dash_text_contains_in_url() throws Throwable {
	    if(driver.getCurrentUrl().contains("dash"))
	    {
	    	System.out.println("Login Success");
	    }
	    else
	    {
	    	System.out.println("Login Fail");
	    }
	}

	@When("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.close();
	}

}
