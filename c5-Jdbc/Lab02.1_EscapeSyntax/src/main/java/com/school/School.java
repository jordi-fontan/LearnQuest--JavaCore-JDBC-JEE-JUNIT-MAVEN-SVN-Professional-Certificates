package com.school;

public class School {

	public static void main(String[] args) {
		SchoolDatabase db = new SchoolDatabase();
		SchoolDAO dao = new SchoolDAO(db);
		dao.printAdmissions();
//		dao.updateAdmissionFirstNameById(3, "Alex");
//		dao.printAdmissions();
//		dao.deleteAdmissionById(3);
//		dao.printAdmissions();
//
//		db.getDatabaseMetaData();
//		System.out.println();
//		db.getTableMetaDataByTableName("ADMISSIONS");
//		System.out.println();
//		dao.getTableMetaData();
		dao.updateStudentBirthDateById(8, "2012-10-31");
		dao.printAdmissions();
	}

}
