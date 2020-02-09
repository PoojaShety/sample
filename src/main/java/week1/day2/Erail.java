package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//maximize the page
	driver.manage().window().maximize();
	//enter the url
	driver.get("https://erail.in");
	//clear the field 
	driver.findElementById("txtStationFrom").clear();
	//enter the value and tab
	driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
	driver.findElementById("txtStationTo").clear();
	driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
	driver.findElementById("chkSelectDateOnly").click();
	//give implicitly wait
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//or Thread.sleep(2000);
	WebElement  train=driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
    List<WebElement> allrows = train.findElements(By.tagName("tr"));
    int size = allrows.size();
	System.out.println(size);
	
	
	
	}
	

}
