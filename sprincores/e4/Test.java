package com.mou.sprincores.e4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mou/sprincores/e4/NewFile3.xml");
		Student s = (Student) context.getBean("stu");
		s.displayInfo();
		

	}

}
