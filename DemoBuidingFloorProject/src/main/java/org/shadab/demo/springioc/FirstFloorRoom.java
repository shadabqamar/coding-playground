package org.shadab.demo.springioc;

import org.shadab.demo.service.DailyService;

public class FirstFloorRoom implements Building {

	private DailyService dailyService;

	// constructor injection
	public FirstFloorRoom(DailyService firstFloorService) {
		dailyService = firstFloorService;
	}

	public String getWindow() {
		return "First floor window";
	}

	public String getDoor() {
		return "First floor door";
	}

	public String getFan() {
		return "First floor fan";
	}

	public String getLight() {
		return "First floor light";
	}

}
