package assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {

	public static void main(String[] args) {

		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("DemoSalesManager", Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa", Keys.TAB);

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("HPE", Keys.TAB);
		driver.findElementById("createLeadForm_firstName").sendKeys("Pooja", Keys.TAB);
		driver.findElementById("createLeadForm_lastName").sendKeys("S", Keys.TAB);

		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Pooja", Keys.TAB);
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S", Keys.TAB);

		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms", Keys.TAB);

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(source);
		sel.selectByVisibleText("Employee");

		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("QA", Keys.TAB);
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("600000", Keys.TAB);

		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select se = new Select(industry);
		se.selectByVisibleText("Computer Software");

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select owner = new Select(ownership);
		owner.selectByVisibleText("Corporation");

		driver.findElementById("createLeadForm_sicCode").sendKeys("7374", Keys.TAB);
		driver.findElementById("createLeadForm_description").sendKeys("abcd jdncjnkn kchuhuhu dhbhdgy", Keys.TAB);
		driver.findElementById("createLeadForm_importantNote").sendKeys("jnnjbgujn", Keys.TAB);
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91", Keys.TAB);
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600045", Keys.TAB);
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("722217", Keys.TAB);

		driver.findElementById("createLeadForm_departmentName").sendKeys("GBS", Keys.TAB);

		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select cur = new Select(currency);
		cur.selectByValue("INR");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("40", Keys.TAB);
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("CVX", Keys.TAB);

		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Pooja", Keys.TAB);

		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://dummylink.com", Keys.TAB);

		driver.findElementById("createLeadForm_generalToName").sendKeys("Pooja", Keys.TAB);
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Xyz nivas,Kadaperi", Keys.TAB);
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Tambaram", Keys.TAB);
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai", Keys.TAB);

		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select co = new Select(country);
		co.selectByVisibleText("India");

		  
		  WebElement marketing =driver.findElementById("createLeadForm_marketingCampaignId"); 
		  Select mrkt=new Select(marketing);
		  mrkt.selectByVisibleText("eCommerce Site Internal Campaign");
		 
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600045");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("45");

		driver.findElementById("createLeadForm_primaryEmail").sendKeys("poojashetty00029@gmail.com");

		WebElement state = driver.findElementByName("generalStateProvinceGeoId");
		Select st = new Select(state);
		st.selectByVisibleText("TAMILNADU");
		
		driver.findElementByClassName("smallSubmit").click();
		
		

	}



}
