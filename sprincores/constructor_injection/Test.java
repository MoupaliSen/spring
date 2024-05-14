package com.mou.sprincores.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mou/sprincores/constructor_injection//ciconfig.xml");
		Person p = (Person) context.getBean("Person");
		System.out.println(p);
		Addition add = (Addition) context.getBean("add");
		add.doSum();

	}

}
