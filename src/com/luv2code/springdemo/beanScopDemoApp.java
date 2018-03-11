package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach =applicationContext.getBean("myCoach",Coach.class);
		
		Coach aphaCoach =applicationContext.getBean("myCoach",Coach.class);
		
		boolean result = theCoach.equals(aphaCoach);
		
		System.out.println("\nResult: "+ result);
		
		System.out.println("\ntheCoach: "+ theCoach);
		System.out.println("\nalphaCoach: "+ aphaCoach);
		
		applicationContext.close();
		
			
	}

}
