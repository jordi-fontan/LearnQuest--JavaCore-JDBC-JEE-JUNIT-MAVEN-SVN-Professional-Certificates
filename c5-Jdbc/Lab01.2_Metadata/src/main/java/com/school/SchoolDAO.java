package com.school;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDAO {
	private Connection conn;
	private Statement stmt;
	
	public SchoolDAO(SchoolDatabase db) {
		conn = db.getConnection();
		
	}

	public void printAdmissions() {
		System.out.println("  ");
		System.out.println("ID\tFIRST_NAME\tLAST_NAME\tDOB\tGENDER\tGRADE");
		System.out.println("=================================================================================");

		// accumulators
		int ttl_count = 0;

		// execute query and process result set
		try {
			PreparedStatement stmt = conn.prepareStatement("select * from admissions");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String firstName = rs.getString("FIRST_NAME").trim();
				String lastName = rs.getString("LAST_NAME").trim();
				String dob = rs.getDate("DOB").toString().trim();
				String gender = rs.getString("GENDER").trim();
				int grade = rs.getInt("GRADE");

				// keep count of items
				ttl_count++;

				System.out.println(id + "\t" + firstName + "\t\t"
						+ lastName+ "\t" + dob.toString()+ "\t"
						+ gender+ "\t" + grade);
			}
			System.out.println("\n\n");

			System.out.printf("Total Item Count: %d\t\n", ttl_count);
		} catch (SQLException e) {
			System.out.println("SQL Exception in SchoolDAO() printAdmissions() " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void updateAdmissionFirstNameById(int id,String firstName) {
		String updateRecord = "UPDATE ADMISSIONS SET FIRST_NAME =? WHERE ID =?";
		try {
			PreparedStatement stmt = conn.prepareStatement(updateRecord);
			stmt.setString(1, firstName);
			stmt.setInt(2, id);
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("SQL Exception in SchoolDAO() updateAdmissionFirstNameById() " + e.getMessage());
		}
		System.out.println("Table ADMISSIONS record updated.");
	}
	
	public void deleteAdmissionById(int id) {
		String deleteRecord = "DELETE FROM ADMISSIONS WHERE ID = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(deleteRecord);
			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("SQL Exception in SchoolDAO() deleteAdmissionById() " + e.getMessage());
		}
		System.out.println("Table ADMISSIONS record deleted.");
	}
	
	public void getTableMetaData() {
		try (PreparedStatement stmt = conn.prepareStatement("Select * from ADMISSIONS")){
			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData data = rs.getMetaData();
			System.out.println("Number of Columns: " + data.getColumnCount());
			System.out.println("Column Label: " + data.getColumnLabel(1));
			System.out.println("Column Name: "+ data.getColumnName(1));
			System.out.println("Table Name: "+ data.getTableName(1));
		}
		catch (SQLException e) {
			System.out.println("SQLException in SchoolDAO.getTableMetaData "+ e.getMessage());
		}
	}
}
