package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		driver.findElementById("FromTag").clear();
		driver.findElementById("FromTag").sendKeys("MAA",Keys.TAB);
		
		driver.findElementById("ToTag").clear();
		driver.findElementById("ToTag").sendKeys("NYC",Keys.TAB);
		
		WebElement adults = driver.findElementById("Adults");//find element for dropdown
		Select sel=new Select(adults);//create object for class select
		sel.selectByVisibleText("2");//visible values we should give present in the dropdown
		
		WebElement child = driver.findElementById("Childrens");
		Select ch=new Select(child);
		ch.selectByVisibleText("1");
		
		driver.findElementById("SearchBtn").click();//to click on search button
		
		/*
		 * String sorryButWe = driver.
		 * findElementByXPath("//div[contains(text(),'Sorry, but we can't continue until you fix everything that's marked in RED')]"
		 * ).getText(); System.out.println(sorryButWe);
		 */
		
		String sorryButWe = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(sorryButWe);
		
		/*
		 * String errmsg = driver.
		 * findElementByXPath("//div[contains(text(),'Sorry, but we can't continue until you fix everything that's marked in RED')]"
		 * ).getText(); System.out.println(errmsg);
		 */
		 
		/*
		 * String errormsg=driver.
		 * findElementByXPath("//div[contains(@class,'lineMessage ugly')]").getAttribute
		 * ("value"); System.out.println(errormsg);
		 */
		
		
	}

}
