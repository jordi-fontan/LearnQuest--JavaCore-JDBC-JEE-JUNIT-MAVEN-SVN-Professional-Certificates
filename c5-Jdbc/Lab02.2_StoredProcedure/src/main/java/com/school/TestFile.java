package com.school;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class TestFile {

	private static final String url = "jdbc:derby://localhost:1527/school;user=sa;password=password";

	public static void main(String[] args) {
		TestFile test = new TestFile();
		test.getStudentLastNameByID(4);
		System.out.println();
		test.getAllStudents();
	}

	public void getStudentLastNameByID(int id){
		String query = "{call get_last_name(?,?)}";
	
		try (Connection conn = DriverManager.getConnection(url);
			CallableStatement cs = conn.prepareCall(query)){
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.VARCHAR);

			cs.executeUpdate();
			String name = cs.getString(2);

			System.out.println("Name: "+ name);
		}

		catch(SQLException e) {
			System.out.println("SqLException in TestFile.getStudentLastNameByID: \n\t"+ e.getMessage());
		}
	}
	
	public void getAllStudents() {
		try ( Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery("select * from ADMISSIONS");
			while(rs.next()) {
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				int id = rs.getInt("ID");
				int grade = rs.getInt("GRADE");
				System.out.println(id+"\t"+ firstName+" "+lastName+"\t"+grade);
			}
		}
		catch (SQLException e) {
			System.out.println("SQLException in TestFile.getAllStudents: \n\t"+e.getMessage());
		}
		
	}

}
