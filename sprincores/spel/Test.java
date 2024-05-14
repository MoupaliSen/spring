package com.mou.sprincores.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expressions;
public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("com/mou/sprincores/spel/spel.xml");
     Demo demo =context.getBean("demo",Demo.class);
     System.out.println(demo);
     
     SpelExpressionParser temp = new SpelExpressionParser();
     Expression expression = (Expression) temp.parseExpression("#{22+66}");
     try {
		System.out.println(expression.getValue());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
