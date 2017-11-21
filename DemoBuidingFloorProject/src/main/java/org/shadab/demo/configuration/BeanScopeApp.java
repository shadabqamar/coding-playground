package org.shadab.demo.configuration;

import org.shadab.demo.springioc.Building;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-scope-applicationContext.xml");

		// retrieve the spring bean
		Building floor = context.getBean("firstFloor", Building.class);
		System.out.println("Retrieving First bean with memory location: " + floor);

		Building singletonfloor = context.getBean("firstFloor", Building.class);
		System.out.println("Retrieving Second bean with memory location : " + singletonfloor);

		// checking if beans are singleton
		boolean result = (floor.equals(singletonfloor));
		System.out.println("\nIs the bean singleton? Answer :" + result);
		context.close();

	}

}
