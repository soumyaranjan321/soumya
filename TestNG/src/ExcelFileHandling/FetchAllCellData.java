package ExcelFileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FetchAllCellData
{
@Test
public void Celldata() throws IOException
{
	FileInputStream fis = new FileInputStream("./testdata/Defect.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	Sheet sheet= workbook.getSheet("Dostana");
	//using for loop
	System.out.println(sheet.getLastRowNum());
	System.out.println(sheet.getRow(2).getLastCellNum());
	
	int rows= sheet.getLastRowNum();
	int colume=sheet.getRow(1).getLastCellNum();
	for(int r=0;r<=rows;r++)
	{
		Row row=sheet.getRow(r);
		for(int c=0;c<=colume;c++)
		{
			Cell cell= row.getCell(c);
			switch(cell.getCellType())
			{
			case STRING:System.out.print(cell.getStringCellValue());break;
			case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			}
			System.out.print("|");
		}
	}
	
}
}
