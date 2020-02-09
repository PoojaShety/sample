package learnExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

		

		public  String[][] readexcel(String excelFileName) throws IOException {
			//ChromeDriver driver=new ChromeDriver();
			XSSFWorkbook book=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
		/* XSSFSheet sheet=book.getSheet("CLEAD"); */
			//int numberOfSheets = book.getNumberOfSheets();
			//System.out.println("noofsheets "+numberOfSheets);
			
			int rowcount = sheet.getLastRowNum();
			System.out.println("rowcount "+rowcount);
			
			short colcount = sheet.getRow(0).getLastCellNum();
			System.out.println("column count "+colcount);
			
			String[][] data=new String[rowcount][colcount];
			
			for (int j = 1; j <=rowcount; j++) {
				XSSFRow row = sheet.getRow(j);
				for (int i = 0; i < colcount; i++) {
					XSSFCell cell = row.getCell(i);
					String value = cell.getStringCellValue();
					data[j-1][i] = value;
				} 
			}
			
			return data;
			

		}

	

	}


