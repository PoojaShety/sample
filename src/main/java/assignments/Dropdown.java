package assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement course = driver.findElementById("dropdown1");
		Select sel=new Select(course);
		sel.selectByIndex(1);
		
		WebElement training = driver.findElementByName("dropdown2");
		Select txt=new Select(training);
		txt.selectByVisibleText("Selenium");
		
		WebElement val = driver.findElementByName("dropdown3");
		Select value=new Select(val);
		value.selectByValue("1");
		
		
		 WebElement dropdown = driver.findElementByClassName("dropdown");
		 Select sele=new Select(dropdown);
		 List<WebElement> options=sele.getOptions();
		 int size=options.size();
		 
		System.out.println(size);
		
		
		
		driver.findElementByXPath("(//div[@class='example']//select)[5]").sendKeys("Selenium");
		
		WebElement multiple = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select");
		Select selec=new Select(multiple);
		selec.selectByIndex(1);
		
		

		
		

	}

}
