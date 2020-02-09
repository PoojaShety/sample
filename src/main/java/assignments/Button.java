package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Point location =driver.findElementById("position").getLocation();
		System.out.println(location);
		
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println("colour code is" + cssValue);
		
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("size is"+size);
		
		//click button to travel home page
		driver.findElementById("home").click();
		
		
		
		

		

		

	}

}
