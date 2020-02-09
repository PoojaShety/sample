package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications"); 
		ChromeDriver driver = new ChromeDriver(options);

		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("pooja_shetty27@yahoo.in");
		driver.findElementById("pass").sendKeys("Ushalatha@123");
		
		driver.findElementByXPath("//input[@value=\"Log In\"]").click();
		
		driver.findElementByXPath("//input[@class=\"_1frb\"]").sendKeys("TestLeaf solutions",Keys.ENTER);
		driver.findElementByXPath("(//a[text()='TestLeaf'])[1]").click();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElementByXPath("(//button[@type='submit'])[2]").click();
		
		driver.findElementByXPath("//button[text()='Like']").click();
		
		//driver.close();
		
		
		

	}

}
