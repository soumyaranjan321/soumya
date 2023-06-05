package ExcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FEtchDataFromArrayListWriteIntoExcel 
{
	@Test
	public void Demo() throws IOException
	{
		FileInputStream fis= new FileInputStream("./TestData/Defect.xlsx");
		{
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			Sheet sheet= wb.createSheet("emp");
			List<Object[]>empdata=new ArrayList<>();
			empdata.add(new Object[] {100,"motoo","Sisoo"});
			empdata.add(new Object[] {101,"cartoon","fnd"});
			empdata.add(new Object[] {101,"Soumya","Don"});
			empdata.add(new Object[] {101,"anil","ChotaDOn"});
			int Rownum=0;
			for(Object[]emp:empdata)
			{
				Row row= sheet.createRow(Rownum++);
				int cellnum= 0;
				for(Object value:emp)
				{
					Cell cell= row.createCell(cellnum++);
					if(value instanceof String)
						cell.setCellValue((String)value);
					if(value instanceof Integer)
						cell.setCellValue((Integer)value);
					if(value instanceof Boolean)
						cell.setCellValue((Boolean)value);		 
				}
				FileOutputStream fos= new FileOutputStream("./TestData/Defect.xlsx");
				wb.write(fos);
			}
		}
	}
}
