package com.school;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDatabase {
	private Connection conn;
	private Statement stmt;
	
	public SchoolDatabase() {
		databaseConnection();
		createAdmissionsTable();
		loadAdmissionsTable();
	}
	
	public Connection getConnection() {
		return conn;
	}
	private void databaseConnection() {
		String driverClass = "org.apache.derby.jdbc.EmbeddedDriver";
		String url = "jdbc:derby:memory:school;create=true";

		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url);
			conn.setAutoCommit(true);
			stmt = conn.createStatement();
			System.out.println("Successful creation of database");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class " + driverClass + "could not be found.");
		}
		catch(SQLException e) {
			System.out.println("SQLException in SchoolDatabase.databaseConnection:"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void createAdmissionsTable() {
		String createSQL = "create table ADMISSIONS (ID int GENERATED ALWAYS AS IDENTITY not null"
				+ " primary key, LAST_NAME char(25) not null, FIRST_NAME char(25) not null, DOB date,"
				+ "GENDER char(1), GRADE int)";
		
		try {
			stmt.executeUpdate(createSQL);
			System.out.println("ADMISSIONS table created.");
		}
		catch(SQLException e) {
			System.out.println("SQLException in SchoolDatabase.createAdmissionsTable:" + e.getMessage());
		}	
	}
	
	private void loadAdmissionsTable() {
		String rows = "INSERT INTO ADMISSIONS (LAST_NAME,FIRST_NAME, DOB, GENDER,GRADE)"
				+ "VALUES( 'Able', 'Adam', '2012-06-1-12.00.00.000000', 'M',1),"
				+ "( 'Baker', 'Betty', '2012-06-1-12.00.00.000000', 'F',2),"
				+ "( 'CASTLE', 'CHARLES', '2012-06-1-12.00.00.000000', 'M',3),"
				+ "( 'DENNING', 'DANIEL', '2012-06-1-12.00.00.000000', 'F',1),"
				+ "( 'Elle', 'Edward', '2012-06-1-12.00.00.000000', 'M',5),"
				+ "( 'Fry', 'Frances', '2012-06-1-12.00.00.000000', 'F',4),"
				+ "( 'GATES', 'GIL', '2012-06-1-12.00.00.000000', 'M',6),"
				+ "( 'Hess', 'Hank', '2012-06-1-12.00.00.000000', 'F',1),"
				+ "( 'Idman', 'Ida', '2012-06-1-12.00.00.000000', 'M',3),"
				+ "( 'JACOBS', 'JAMES', '2012-06-1-12.00.00.000000', 'M',2)";

		try {
			stmt.execute(rows);
		} catch (SQLException e) {
			System.out.println("SQL Exception in SchoolDAO() loadAdmissionsTable() " + e.getMessage());
		}
		System.out.println("Table ADMISSIONS loaded.");
	}
	
}
