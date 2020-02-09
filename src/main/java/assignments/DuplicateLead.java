package assignments;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("DemoSalesManager", Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa", Keys.TAB);

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("poojashetty00029@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	//driver.findElementByXPath("//a[@class='linktext'])[4])").click();
		driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10068'])[1]").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByClassName("smallSubmit").click();
		
		
	
		

	}

}
