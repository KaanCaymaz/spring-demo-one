package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeSycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeSycle-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		context.close();

	}

}
