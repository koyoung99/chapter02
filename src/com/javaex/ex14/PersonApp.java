package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("정우성", 45);

//		System.out.println(p01.toString());

		p01.showInfo();

		Student s01 = new Student();
		s01.setName("이정재");
		s01.setAge(47);
		s01.setSchoolName("서울고등학교");

//		System.out.println(s01.toString());
		s01.showInfo();

		Student s02 = new Student("유재석", 34, "강남고등학교");
		s02.showInfo();

	}

}
