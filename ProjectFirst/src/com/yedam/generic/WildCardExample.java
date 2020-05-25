package com.yedam.generic;

import java.util.Arrays;

//<T>
//665페이지 <?>,<? extends class> <? super class>
// 하위 extends 상위    ,  상위 super 하위

//최상위     상속-> worker,student ->상속 highstudent
//Person -> worker
//       -> Student -> HighStudent
// Course<T>

public class WildCardExample
{
	public static void registerCourse(Course<?> course)
	{
		//Course<Person> , Course<Student>, Course<Worker>, Course<HighStudent> 매게값 다 가능
		System.out.println(course.getName()+ " " + Arrays.toString(course.getStudents()));
	} 
	//Arrays.toSting이 뭐냐면
	//배열[1,2,3] =>출력결과로 [1,2,3]이라는 모양으로 출력하겠다. 
	public static void registerStudent(Course<? extends Student> course)
	{
		System.out.println(course.getName()+ " " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerWorker(Course<? super Worker> course)
	{
		System.out.println(course.getName()+ " " + Arrays.toString(course.getStudents()));	
	}
	
	public static void main(String[] args)
	{
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));
		
		
		Course<Worker> courseWorker = new Course<Worker>("직장인과정", 5);
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생과정", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));
		
		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생 과정", 5);
		courseHigh.add(new HighStudent("고등학생"));
		courseHigh.add(new HighStudent("고등1"));
		courseHigh.add(new HighStudent("고등2"));
		courseHigh.add(new HighStudent("고3"));
		courseHigh.add(new HighStudent("고3"));
		
		//Course<?> // 모든 타입을 다 받겠다 Course<?> course
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		//Course<? entends class> //스튜던트 클래스나 스튜던트 클래스를 상속받는 클래슴나
		registerStudent(courseHigh);
		registerStudent(courseStudent);
		
		//Course<? super class> - worker클래스가 상속받는 클래스나 워커클래스만
		registerWorker(coursePerson);
		registerWorker(courseWorker);
	}
}
