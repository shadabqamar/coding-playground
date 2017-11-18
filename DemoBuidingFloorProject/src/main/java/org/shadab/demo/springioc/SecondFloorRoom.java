package org.shadab.demo.springioc;

import org.shadab.demo.service.DailyService;

public class SecondFloorRoom implements Building {

	// private field for DI
	private DailyService dailyService;

	// constructor injection
	public SecondFloorRoom(DailyService secondFloorRoom) {
		dailyService = secondFloorRoom;
		System.out.println("Dailyservice dependency created in SecondFloorRoom bean");
	}

	public SecondFloorRoom() {
	}

	public String getWindow() {
		return "Second floor window";
	}

	public String getDoor() {
		return "Second floor door";
	}

	public String getFan() {
		return "Second floor fan";
	}

	public String getLight() {
		return "Second floor light";
	}

	@Override
	public String getDailyService() {
		return dailyService.floorwiseParking();
	}

}
