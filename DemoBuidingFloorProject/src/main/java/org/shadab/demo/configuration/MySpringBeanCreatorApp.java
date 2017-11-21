package org.shadab.demo.configuration;

import org.shadab.demo.springioc.Building;
import org.shadab.demo.springioc.FirstFloorRoom;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringBeanCreatorApp {
	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
/*		Building firstFloorbean = context.getBean("firstFloor", Building.class);
*/
		// bean injected by setter injection
		Building secondFloorbean = context.getBean("secondFloor", Building.class);

		//Need to create FirstFloorRoom bean object to access private literal injection
		FirstFloorRoom firstFloorbean = context.getBean("firstFloor", FirstFloorRoom.class);

		// To check all beans are created from applicationContext file
		for (String bean : context.getBeanDefinitionNames()) {
			System.out.println("Bean name :" + bean);
			if (bean.equalsIgnoreCase("dailyService")) {
				System.out.println("dailyService bean injected successfully");
			}
		}

		System.out.println("Daily service wish for first floor:" + firstFloorbean.getYourDailyService());
		System.out.println("Daily service wish for second floor:" + secondFloorbean.getYourDailyService());

		System.out.println("----------------------------------------------");

		// let's call our new method for windows
		System.out.println("Bean window method :" + firstFloorbean.getWindow());
		System.out.println("Bean window method :" + secondFloorbean.getWindow());

		// let's call our new method for doors
		System.out.println("Bean door method :" + firstFloorbean.getDoor());
		System.out.println("Bean door method :" + secondFloorbean.getDoor());

		// Testing literal injection
		System.out.println("Total number of rooms : " + firstFloorbean.getTotalRooms());

		System.out.println("Total Maintainence: " + firstFloorbean.getTotalMaintainence());

		// close the context
		context.close();

	}
}
