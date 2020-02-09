
package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		String findval = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println(findval);
		
		String val = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/a").getAttribute("href");
		
		System.out.println(val);

      if (val.contains("error.html")) {
    	  System.out.println("Error");
    	  
      }else {
    		System.out.println("No Error");
    	}
      
		
     //driver.findElementByLinkText("Go to Home Page").click();
     
     //driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div/div/a").click();
      
     // List<WebElement> link = driver.findElements(By.tagName(“a”));

      //System.out.println(link.size());
     
     
		
		  List<WebElement> links = driver.findElements(By.tagName("a")); //Identify the
		  //number of Link on webpage and assign into Webelement List
		  
		  int linkCount = links.size(); // Count the total Link list on Web Page
		  
		  System.out.println("Total Number of link count on webpage = " + linkCount);
		    //Print the total count of links on webpage
		
	}

}
