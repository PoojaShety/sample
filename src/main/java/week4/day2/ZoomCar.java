package week4.day2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByXPath("//a[@class='search']").click();
		driver.findElementByXPath("//div[@class='items'][4]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();

		//driver.findElementByXPath("(//div[@class='text'])[2]").click();
//System.out.println(text);

		Date date = new Date(); // Get the current date DateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd"); // Get only the date (and not month, year,time etc)
		String today = sdf.format(date); // Get today's date int tomorrow =
		int tomorrow = Integer.parseInt(today) + 1;// Convert to integer and add 1 to it System.out.println(tomorrow);
		System.out.println(tomorrow);
		
		driver.findElementByXPath("//div[contains(text(),'25')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		driver.findElementByXPath("//button[text()='Done']").click();
		
		/*
		 * List<WebElement> car =
		 * driver.findElementsByXPath("//div[@class='car-list-layout']"); int size =
		 * car.size(); System.out.println(size);
		 */
		
		//In Result Screen
		List<WebElement> priceList = driver.findElementsByXPath("//div[@class='price']");
		List<Integer> priceInt=new ArrayList();
		
		for(int i=0;i<priceList.size();i++) {
			priceInt.add(Integer.parseInt(priceList.get(i).getText().replaceAll("[^0-9]","")));
		}
		
		Collections.sort(priceInt);
		DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###");
		String price=IndianCurrencyFormat.format(priceInt.get(priceInt.size()-1));
		System.out.println("Max Price:"+ price);
		WebElement maxPriceoftheCar = driver.findElementByXPath("//div[contains(text(),'"+price+"')]");
		String text = driver.findElementByXPath("//div[contains(text(),'"+price+"')]/preceding::h3[1]").getText();
		System.out.println("Car Name:"+ text);
		
		driver.findElementByXPath("//div[contains(text(),'1,292')]/following::button[1]").click();
		
		
		//driver.close();
		//System.out.println(price);
		
		
		
		
		//Dimension size = driver.findElementByXPath("//div[@class='details']").getSize();
		//Dimension size2 = driver.findElementByXPath("//div[@class='car-list-layout']").getSize();
		
		//Map<String,Integer> HashMap=new HashMap();
		
		
		
		
	}

}

		
	


