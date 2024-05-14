package com.mou.sprincores.e3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/mou/sprincores/e3/NewFile2.xml");
		@SuppressWarnings("unused")
		Student p=(Student) context.getBean("stu");
		p.displayInfo();
		

	}

}
