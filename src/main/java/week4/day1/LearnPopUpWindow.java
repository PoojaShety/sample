package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPopUpWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		
		Set<String> allwindowSet = driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>();
		
		windowList.addAll(allwindowSet);
		driver.switchTo().window(windowList.get(1));
		System.out.println("child "+driver.getTitle());
		System.out.println("child "+driver.getCurrentUrl());
	
		 
		
		

	}

}
