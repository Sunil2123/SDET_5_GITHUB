package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class MySqlConnectorTest 
{
	@Test
	public void mySqlConnector() throws Throwable
	{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","root");
		Statement stmt = con.createStatement();
		 ResultSet res = stmt.executeQuery("select*from students_info;");
		 while (res.next()) 
		 {
			 System.out.println(res.getString(1)+" "+res.getString(2));
			
		}
		 con.close();
		 
		
	}

}
