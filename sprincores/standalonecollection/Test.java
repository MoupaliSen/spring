package com.mou.sprincores.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mou/sprincores/standaloneCollection/aloneConfig.xml");
		Person person1 =context.getBean("person1",Person.class);	
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeesstructure().getClass().getName());

		System.out.println(person1.getProperties());

	}

}
