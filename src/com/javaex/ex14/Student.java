package com.javaex.ex14;

public class Student extends Person {

	private String schoolName;

	public Student() {
		System.out.println("Student()");
	}

	public Student(String name, int age, String schoolName) {
		// name, age 부모 schoolName 자신
		super(name, age);
		this.schoolName = schoolName;
	}

//	public Student(String schoolName) {
//		this.schoolName = schoolName;
//		System.out.println("Student(schoolName)");
//	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

}
