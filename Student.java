package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public void studentName() {

		System.out.println("studentName : G.Sekar");

	}

	public void studentDept() {
		System.out.println("studentdept : ECE");
	}

	public void studentId() {

		System.out.println("student Id :20221001");
	}

	public static void main(String[] args) {

		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();

		Department department = new Department();
		department.deptName();

		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
