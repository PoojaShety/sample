package assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElementById("RoundTrip").click();
		driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);
		driver.findElementById("ToTag").sendKeys("New York",Keys.TAB);
		
		driver.findElementById("DepartDate").sendKeys("30-10-2019",Keys.TAB);
		driver.findElementById("ReturnDate").sendKeys("30-11-2019",Keys.TAB);
		
		WebElement adults = driver.findElementById("Adults");
		Select sel=new Select(adults);
		sel.selectByVisibleText("2");
		
		
		WebElement childrens = driver.findElementById("Childrens");
		Select sele=new Select(childrens);
		sele.selectByVisibleText("1");
		
		WebElement infants = driver.findElementById("Infants");
		Select selec=new Select(infants);
		selec.selectByVisibleText("1");
		
		driver.findElementById("MoreOptionsLink").click();
		
		WebElement cls = driver.findElementById("Class");
		Select se=new Select(cls);
		se.selectByVisibleText("Premium Economy");
		Thread.sleep(2000);
		
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates (EK)",Keys.TAB);
		
		driver.findElementById("SearchBtn").click();
		
		
		
		
		
		
		

	}

}
