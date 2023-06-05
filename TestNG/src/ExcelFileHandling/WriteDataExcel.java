package ExcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataExcel 
{
	@Test
	public void WriteDataExcel() throws IOException
	{
		FileInputStream fis= new FileInputStream("./TestData/Defect.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);

		Sheet s= wb.createSheet("Automation");
		Row r=s.createRow(5);
		Cell c= r.createCell(3);
		c.setCellValue("Golumolu");
		FileOutputStream fos= new FileOutputStream("./TestData/Defect.xlsx");
		wb.write(fos);

	}
}
