package testcases;

//import java.io.IOException;

import org.testleaf.leaftaps.base.ProjectSpecificMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	//String excelFileName=" ";
	/*
	 * @BeforeTest public void setData() { excelFileName = "CreateLead"; }
	 */

	@Test(dataProvider = "sendData")
	public void createLead(String cname, String fname, String lname) {
		// login();
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		//driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("44");

		driver.findElementByName("submitButton").click();

	}
	/*
	 * @DataProvider public String[][] sendData() throws IOException {
	 * 
	 * String[][] data=new String [2][3]; data[0][0]="TestLeaf"; data[0][1]="Pooja";
	 * data[0][2]="shetty";
	 * 
	 * data[1][0]="TestLeaf"; data[1][1]="Sharmila"; data[1][2]="M";
	 * 
	 * 
	 * return data;
	 * 
	 * readExcel excel=new readExcel(); return excel.readexcel("CreateLead");
	 * 
	 * 
	 * }
	 */

}
