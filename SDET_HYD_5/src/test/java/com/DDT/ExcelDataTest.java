package com.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataTest 
{

	@Test
	public void excelDataTest() throws Throwable 
	{
	FileInputStream fis=new FileInputStream("./TestData1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	Row ro=sh.getRow(1);
	Cell co=ro.getCell(0);
	Cell co1=ro.getCell(1);
	Cell co2=ro.getCell(2);
	String str=co.getStringCellValue();
	String str1=co1.getStringCellValue();
	String str2=co2.getStringCellValue();
	System.out.println(str);
	System.out.println(str1);
	System.out.println(str2);
			}

}
