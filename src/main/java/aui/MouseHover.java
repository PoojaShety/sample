package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Mi").click();
		
	}
		
		
		
		

	}


