package com.mou.sprincores;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student p=(Student) context.getBean("moupali");
		p.display();
		
	}

}
