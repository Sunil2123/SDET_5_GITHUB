package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest 
{
	@Test
	public void executeQuery() throws Throwable
	{
		Connection con=null;

		try {
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select*from students_info");
			while (res.next()) 
			{
			System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("connection closed");
		con.close();
		}
		
	}

}
