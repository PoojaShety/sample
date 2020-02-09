package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		/*
		 * WebElement source = driver.findElementById("src"); Select se=new
		 * Select(source); se.selectByVisibleText("Chennai");
		 */
		driver.findElementById("src").sendKeys("Chennai",Keys.TAB);
		driver.findElementById("dest").sendKeys("Trichy",Keys.TAB);
		//driver.findElementById("onward_cal").sendKeys("30-10-2019");
		
		driver.findElementByXPath("(//label[contains(@class,'db text-trans-uc')])[1]").sendKeys("06092019");
		driver.findElementById("search_btn").click();
		
		driver.findElementById("dtAfter 6 pm").click();
		
		
		

	}

}
