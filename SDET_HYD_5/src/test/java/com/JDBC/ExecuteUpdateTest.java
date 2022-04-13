package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest 
{
	@Test
	public void executeUpdate() throws Throwable
	{
		Connection con=null;
		try {
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			   Statement stmt = con.createStatement();
			int res = stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values('5', 'sunil','gowda', 'h');");
			 if (res==1)
			 {
				System.out.println("data is available");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
	     con.close();
		}
	}

}
