package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumber {

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
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("HPE", Keys.TAB);
		driver.findElementById("createLeadForm_firstName").sendKeys("Pooja", Keys.TAB);
		driver.findElementById("createLeadForm_lastName").sendKeys("S", Keys.TAB);
		
		driver.findElementByClassName("smallSubmit").click();
		
		String txt = driver.findElementById("viewLead_companyName_sp").getText();
		
		System.out.println(txt);
		
		System.out.println(txt.substring(5, 10));

	}

}
