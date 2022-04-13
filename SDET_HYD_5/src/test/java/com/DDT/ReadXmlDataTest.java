package com.DDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadXmlDataTest 
{
@Test
public void readXmlData(XmlTest xml)
{
	String url=xml.getParameter("URL");
	String un=xml.getParameter("UN");
	String pwd=xml.getParameter("PWD");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
