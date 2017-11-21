package org.shadab.demo.service;

import java.util.ArrayList;
import java.util.Random;

public class FloorGreetingService implements DailyService {

	@Override
	public String getFloorGreeting() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Good Morning");
		list.add("Good Evening");
		list.add("Good Night");
		list.add("Have a nice day");

		int rnd = new Random().nextInt(list.size());
		return list.get(rnd);
	}

}
