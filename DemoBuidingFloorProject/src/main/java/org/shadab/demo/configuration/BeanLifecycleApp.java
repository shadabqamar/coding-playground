package org.shadab.demo.configuration;

import org.shadab.demo.springioc.Building;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-lifecycle-applicationContext.xml");

		// retrieve the spring bean
		Building floor = context.getBean("firstFloor", Building.class);

		System.out.println(floor.getYourDailyService());
		context.close();

	}

}
