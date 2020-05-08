package com.yedam.classes;

public class studentexample {
	public static void main(String[] args) {
		student stu = new student(); //new라는 키워드로 instance 만듦 
		stu.name = "Son";
		stu.age = 30;
		stu.height = 171.4;
		stu.weight = 71.1;
		stu.study();
		stu.eat("물");
		stu.exercise();
		System.out.println("이름은 :"+stu.name + ","+ "나이는" + stu.age);
		
		student stu1 = new student(); //new라는 키워드로 instance 만듦
		stu1.name = "yong";
		stu1.age = 29;
		stu1.height = 170.4;
		stu1.weight = 70.1;
		stu1.study();
		stu1.eat("얼음");
		stu1.exercise();
		
		student stu2 = new student("won");
		stu2.age = 2038;
		stu2.height = 5600.4;
		stu2.weight = 30.1;
		stu2.study();
		stu2.eat("bananananananananananan");
		stu2.exercise();
		System.out.println("이름은 :"+stu2.name + ","+ "나이는" + stu2.age);
		
		People peo = new People("d","d","d");
		peo.color = "yellow";
		peo.city = "daegu";
		peo.country = "korea";
		peo.showInfo();
		peo.forfun("자전거");
		peo.play("자바연습");
		
		student[] s1 = new student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "won";
		int stunum = 0;
		for(student stud : s1) {
			//System.out.println(stud.name+"/" + stud.age);
			if (stud.name.equals(inputStr)) {
				System.out.println("s1["+stunum++ +"]"+ "="+inputStr);
			}
		}
	}
}
