package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolStoredProcedures {

	public static void getStudentLastNameById(int id, String[] studentLastNameOut) throws SQLException{
		
		String studentLastName = null;
		
		String dbURL = "jdbc:default:connection";
		Connection conn = DriverManager.getConnection(dbURL);
		
		String query = "select last_name from admissions where id = ?";		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		if(!rs.next()) {
			return;
		}
		studentLastName = rs.getString("Last_Name");
		
		System.out.printf("Name found in Stored Procedure: " + studentLastName);
		studentLastNameOut[0] = studentLastName;
	}

	
}
