package com.mou.sprincores.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("unused")
		ApplicationContext context =new ClassPathXmlApplicationContext("com/mou/sprincores/autowire/annotation/autoconfig.xml");
		Emp emp1= context.getBean("emp1",Emp.class);
	    System.out.println(emp1);

	}

}
