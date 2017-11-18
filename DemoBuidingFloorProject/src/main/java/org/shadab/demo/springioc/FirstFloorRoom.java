package org.shadab.demo.springioc;

import org.shadab.demo.service.DailyService;

public class FirstFloorRoom implements Building {

	// private field for DI
	private DailyService dailyService;

	// constructor injection
	public FirstFloorRoom(DailyService firstFloorService) {
		dailyService = firstFloorService;
		System.out.println("Dailyservice dependency created in FirstFloor bean");
	}

	public FirstFloorRoom() {
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

	@Override
	public String getDailyService() {
		return dailyService.floorwiseParking();
	}

}
