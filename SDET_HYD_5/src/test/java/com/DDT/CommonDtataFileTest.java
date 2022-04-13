package com.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class CommonDtataFileTest 
{
	@Test
	public void commonDataTest() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("URL");
		String un=p.getProperty("UN");
		String pwd=p.getProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
		
	}

}
