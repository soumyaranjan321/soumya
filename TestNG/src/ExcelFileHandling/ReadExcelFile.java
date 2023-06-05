package ExcelFileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile
{
	@Test
	public void readExcel() throws IOException
	{
		FileInputStream fis= new FileInputStream("./TestData/Defect.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		Sheet s= wb.getSheet("Selenium");
		Row row= s.getRow(5);
		Cell c= row.getCell(2);
		System.out.println(c.getStringCellValue());
		System.out.println(wb.getSheet("selenium").getRow(5).getCell(2).getStringCellValue());
		
		
	}

}
