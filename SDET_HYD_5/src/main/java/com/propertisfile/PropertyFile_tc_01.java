package com.propertisfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PropertyFile_tc_01 
{
	public static Properties testCase01() throws Throwable
	{
	FileInputStream fis=new FileInputStream("./data.properties");
	Properties p=new Properties();
    p.load(fis);
    return p;			
	}
	public static Cell excelSheet() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Row ro=sheet.getRow(1);
		Cell co=ro.getCell(0);
		co.getStringCellValue();
		return co;
	}	
	public static String getorg() throws Throwable
	{
		return excelSheet().getStringCellValue();
	}
	
	public static String geturl() throws Throwable
	{
		return testCase01().getProperty("URL");

	}
	public static  String getusername() throws Throwable
	{
		return testCase01().getProperty("UN");
	}
    public static String getpassword() throws Throwable
    {
    	return testCase01().getProperty("PW");
    }
	
}
