
package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12",Keys.TAB);
		driver.findElementById("buttonLogin").click();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement vendors = driver.findElementByXPath("//button[text()=' Vendors']"); 
		

		Actions builder = new Actions(driver);

		builder.moveToElement(vendors).perform();
		//Thread.sleep(2000);
		
		driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		
		String country = driver.findElementByXPath("(//table//tr)[2]/td[5]").getText();
	    System.out.println("Country is"+country);
	    
	    driver.findElementByXPath("//a[text()='Log Out']").click();
	    driver.close();


	}

}
