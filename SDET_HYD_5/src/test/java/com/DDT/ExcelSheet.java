package com.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelSheet 
{
	@Test
	public void excelSheet() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row ro=sheet.getRow(1);
		Cell co=ro.getCell(0);
		String str=co.getStringCellValue();
		System.out.println(str);
	}

}
