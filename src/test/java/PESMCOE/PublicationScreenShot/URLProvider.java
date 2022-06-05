package PESMCOE.PublicationScreenShot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class URLProvider {
	@DataProvider(name = "publicationURL")
	public Object[][] urlProvider() throws IOException {
		//437
		Object data[][]=new Object[4][2];
		FileInputStream fs = new FileInputStream(
				"F:\\java\\PublicationScreenShot\\src\\test\\resources\\3.3.2_Final.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Final 3.3.2");
		XSSFRow row = sheet.getRow(9);
		XSSFCell cell = row.getCell(0);
		String value = String.valueOf((int)cell.getNumericCellValue());
		int lastrow = sheet.getLastRowNum();
		System.out.println("Value in cell is:" + value);
		System.out.println("Last row num is:" + lastrow);
		for (int i = 9; i <= 12; i++) {
			XSSFRow row1 = sheet.getRow(i);
			for (int j = 0,k=0; j <= 8; j = j + 8,k++) {
				XSSFCell cell1 = row1.getCell(j);
				if(j==0)
				data[i-9][k]=String.valueOf((int)cell1.getNumericCellValue());
				else
					data[i-9][k]=cell1.getStringCellValue();
		//		System.out.print(data[i-9][k]+"\t");
			}
		//	System.out.println();
		}
		 return data;
	}
}
