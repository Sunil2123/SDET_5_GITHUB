package com.practce;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class DDTTest 
{
	@Test
	public void ddtTest() throws Throwable
	
	{
	FileReader fis=new FileReader("./javaObject.json")	;
	JSONParser jp=new JSONParser();
	Object obj = jp.parse(fis);
	HashMap h= (HashMap)obj;
	Object str = h.get("status");
	System.out.println(str);
		
		
		
	}

}
