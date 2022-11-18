package org.college;

public class Dept {
	private void deptName() {
		System.out.println("Department Name : Mechanical");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		s.passOut();
		s.jobRole();
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Dept d = new Dept();
		d.deptName();
		Hostel h = new Hostel();
		h.hostelName();
	}
}
