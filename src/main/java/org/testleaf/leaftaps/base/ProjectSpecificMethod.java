package org.testleaf.leaftaps.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import learnExcel.readexcel;

public class ProjectSpecificMethod {
	String excelFileName;
	public ChromeDriver driver;
	@Parameters({"url","uName","password"})
	@BeforeMethod
	public void login(String url,String uname,String pwd) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
	}
	
	
	  
	  
	  
	  @AfterMethod
	  public void logout() {
		  driver.close();
		  }
	  
	  @BeforeTest
	  public void setData()
	  {
		  excelFileName="CreateLead";
	  }
	  
		@DataProvider
		  public String[][] sendData() throws IOException
		  {
			/*
			 * String[][] data=new String [2][3]; data[0][0]="TestLeaf"; data[0][1]="Pooja";
			 * data[0][2]="shetty";
			 * 
			 * data[1][0]="TestLeaf"; data[1][1]="Sharmila"; data[1][2]="M";
			 * 
			 * 
			 * return data;
			 */
			  readexcel excel=new readexcel();
			  
			return excel.readexcel(excelFileName);
			  
			  
		  }

}
