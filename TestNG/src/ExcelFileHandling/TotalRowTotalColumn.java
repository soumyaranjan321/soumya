package ExcelFileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TotalRowTotalColumn 
{
	@Test
	public void TotalRowTotal() throws IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/Defect.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("Dostana");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		int count=0;
	for(int i=0;i<=rowcount;i++)
	{
		count= sheet.getRow(i).getLastCellNum();
		
	}
	System.out.println(count);
		
		
		
	}
}
