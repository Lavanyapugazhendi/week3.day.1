package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name = Lavanya");

	}

	public void studentDept() {
		System.out.println("Student Department = B.com");

	}

	public void studentId() {
		System.out.println("Student Id = 345");

	}
    public static void main(String[] args) {
		Student collegedata = new Student();
		
		collegedata.collegeName();
		collegedata.collegeCode();
		collegedata.collegeRank();
		collegedata.deptName();
		collegedata.studentName();
		collegedata.studentDept();
		collegedata.studentId();
		
	}

}
