package com.mou.sprincores.e2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/mou/sprincores/e2/NewFile.xml");
		@SuppressWarnings("unused")
		Student p=(Student) context.getBean("stu");
		System.out.println(p);
		

	}

}
