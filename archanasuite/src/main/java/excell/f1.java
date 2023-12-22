package excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class f1 {

	@Test
	public void r() throws IOException
	{
	//excel : apache poi, apache poi ooxml, apache poi ooxml schema
	
	File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
	FileInputStream fis= new FileInputStream(f);
	//xlsx:XSSFWrokbook
	//xls:HSSFWorkbook
	XSSFWorkbook x= new XSSFWorkbook(fis);
	XSSFSheet sheet = x.getSheetAt(0);
	
	// number of rows
	int row=sheet.getLastRowNum();
	System.out.println("Number of rows "+ row);
	
	// number of columns : row number
	int col=sheet.getRow(0).getLastCellNum();
	System.out.println("Number of columns in first row is "+ col);
	
	//reading 
	XSSFCell data = sheet.getRow(2).getCell(2);
	System.out.println(data);
	
	//get a row : iterate column wise
	//Row1
	System.out.println("Row content : ");
	for(int i=0;i<col;i=i+1)
	{
	XSSFCell data1 = sheet.getRow(1).getCell(i);
	System.out.println(data1);
	//1,0   1,1  1,2   1,3   1,4   1,5
	}
	
	
	//column : row wise iteration
	System.out.println("column content : ");
	for(int i=0;i<row;i=i+1)
	{
	XSSFCell data2 = sheet.getRow(i).getCell(0);
	System.out.println(data2);
	//0,0   1,0   2,0  3,0      70,0 
	}
	
	//33,4
	sheet.getRow(33).createCell(4).setCellValue("bye");
	FileOutputStream fos= new FileOutputStream(f);
	x.write(fos);
}
}