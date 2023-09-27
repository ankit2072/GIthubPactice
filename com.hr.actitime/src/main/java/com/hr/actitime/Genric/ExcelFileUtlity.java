package com.hr.actitime.Genric;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFileUtlity {
	
public String getdataFromExcel(String sheetname,int rowno,int cellno) throws Throwable {
		
		FileInputStream fis= new FileInputStream(IpathConstant1.excelfilepath);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		String Value=wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
 return Value;
}
public void UpdatedataFromExcel(String sheetname,int rowno,int cellno,String data) throws Throwable {
		
		FileInputStream fis= new FileInputStream(IpathConstant1.excelfilepath);
		
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rowno).getCell(cellno).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(IpathConstant1.excelfilepath);
		wb.write(fos);
		

}

}
