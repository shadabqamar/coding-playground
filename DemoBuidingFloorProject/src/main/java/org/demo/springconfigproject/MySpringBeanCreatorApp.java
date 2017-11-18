package org.demo.springconfigproject;

import org.demo.springdemoproject.Building;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringBeanCreatorApp {
	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Building building = context.getBean("firstFloor", Building.class);

		// To check all beans are created from applicationContext file
		for (String bean : context.getBeanDefinitionNames()) {
			System.out.println("Bean name :" + bean);
		}

		System.out.println("----------------------------------------------");

		/*
		 * Uncomment below line to retrieve secondFloor bean and comment above
		 * firstFloor bean retrieval
		 */

		// Building building = context.getBean("secondFloor", Building.class);

		// let's call our new method for windows
		System.out.println(building.getWindow());

		// let's call our new method for doors
		System.out.println(building.getDoor());

		// close the context
		context.close();

	}
}
