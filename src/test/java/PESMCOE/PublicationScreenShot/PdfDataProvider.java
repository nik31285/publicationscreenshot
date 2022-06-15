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

public class PdfDataProvider {
	@DataProvider(name = "pdfpathprovider")
	public Object[][] pdfPath() throws IOException {
		Object [][]path=new Object[361][2];
		FileInputStream is=new FileInputStream("D:\\1_NAAC Criteria III\\DVV WORK\\PDF all papers\\link.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(is);
		XSSFSheet sheet=book.getSheetAt(0);
		for (int i = 0; i < path.length; i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<=1;j++) {
				XSSFCell cell=row.getCell(j);
				if(j==0)
				path[i][j]=cell.getStringCellValue();
				else
					path[i][j]=String.valueOf((int)cell.getNumericCellValue());
			}
			
		//	System.out.println(path[i]);
		}
		return path;
	}

}
