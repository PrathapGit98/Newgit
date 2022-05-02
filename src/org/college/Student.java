package org.college;

public class Student  extends College{
	public void studentName() {
System.out.println("StudentName=Prathap");
	}
	public  void studentDept() {
System.out.println("dept=cs");
	}
	public void studentId() {
System.out.println("002");
	}
public static void main(String[] args) {
	Student s= new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.hashCode();
	s.hostelName();
	s.deptName();
}
}
