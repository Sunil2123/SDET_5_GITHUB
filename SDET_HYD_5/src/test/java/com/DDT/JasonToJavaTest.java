package com.DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class JasonToJavaTest 
{
	@Test
	public void jsonToJava() throws Throwable
	{
		//step1:converting JSON file Json object
		FileReader fs=new FileReader("./javaObject.json");
		//step2:converting json object to java object
		JSONParser prs=new JSONParser();
		Object jobj = prs.parse(fs);
		//read the data
		HashMap hm=(HashMap)jobj;
		String str=(String) hm.get("status");
		System.out.println(str);
		
		
	}

}
