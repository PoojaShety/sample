package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	

	@Given("Open the Chrome Browser")
	public void openTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	    
	}

	@Given("Maximize the Browser")
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
	    
	}

	@Given("Load the URL")
	public void loadTheURL() {
	   driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("set the timeouts")
	public void setTheTimeouts() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@Given("Enter the Username as (.*)")
	public void enterTheUsername(String data) {
		driver.findElementById("username").sendKeys(data, Keys.TAB);
		

	}

	@Given("Enter the password as (.*)")
	public void enterThePassword(String data) {
		driver.findElementById("password").sendKeys(data, Keys.TAB);
	    
	}

	@Given("Click on the Login Button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRM\\/SFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		
	    
	}

	@Given("Click Create lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@Given("Enter Company Name as (.*)")
	public void enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data, Keys.TAB);
	    
	}

	@Given("Enter First Name as (.*)")
	public void enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data, Keys.TAB);
	    
	}

	@Given("Enter Last Name as (.*)")
	public void enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data, Keys.TAB);

	}

	@When("Click on Create Lead")
	public void clickOnCreateLead() {
		driver.findElementByClassName("smallSubmit").click();
	    
	}

	@Then("Verify the Create Lead")
	public void verifyTheCreateLead() {
		System.out.println("Verification done");
	    
	}



}
