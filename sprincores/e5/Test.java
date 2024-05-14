package com.mou.sprincores.e5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mou/sprincores/e5/NewFile4.xml");
		Student s = (Student) context.getBean("stu");
		s.displayInfo();
		

	}

}


