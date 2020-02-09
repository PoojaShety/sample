package learnExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		//ChromeDriver driver=new ChromeDriver();
		XSSFWorkbook book=new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet=book.getSheet("CLEAD");
		int numberOfSheets = book.getNumberOfSheets();
		System.out.println("noofsheets "+numberOfSheets);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcount "+rowcount);
		
		short colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count "+colcount);
		
		for (int j = 1; j <=rowcount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < colcount; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		
		
		

	}

}
