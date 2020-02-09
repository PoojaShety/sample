package stepsD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteSteps {
	public ChromeDriver driver;

@Given("Open the Chrome Browser")
public void openTheChromeBrowser() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 
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

@Given("Enter the Username as Demosalesmanager as (.*)")
public void enterTheUsernameAsDemosalesmanager(String data) {
	driver.findElementById("username").sendKeys(data, Keys.TAB);
    
}

@Given("Enter the password as crmsfa as (.*)")
public void enterThePasswordAsCrmsfa(String data) {
	driver.findElementById("password").sendKeys(data, Keys.TAB);
   
}



@Given("Click on the Login Button")
public void clickOnTheLoginButton() {
    }

@Given("Click CRM\\/SFA")
public void clickCRMSFA() {
   
}

@Given("Click on Leads")
public void clickOnLeads() {
   
}

@Given("Click on Find Leads")
public void clickOnFindLeads() {
    
}

@Given("Click on Phone option in Find Leads page")
public void clickOnPhoneOptionInFindLeadsPage() {
    
}

@Given("Search the phone number as {int}")
public void searchThePhoneNumberAs(Integer int1) {
   
}

@Given("Click on the Find Leads Button")
public void clickOnTheFindLeadsButton() {

}

@Given("Click on the Lead id")
public void clickOnTheLeadId() {
    
}

@When("Click on the Delete Button")
public void clickOnTheDeleteButton() {

}

@Then("verify lead is deleted")
public void verifyLeadIsDeleted() {
    
}


}
