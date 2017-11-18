package org.demo.springconfigproject;

import org.demo.springdemoproject.Building;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringBeanCreatorApp {
	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Building building = context.getBean("myFloor", Building.class);

		// let's call our new method for windows
		System.out.println(building.getWindow());

		// let's call our new method for doors
		System.out.println(building.getDoor());

		// close the context
		context.close();

	}
}
