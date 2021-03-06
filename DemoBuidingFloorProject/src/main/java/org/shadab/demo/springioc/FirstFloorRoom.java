package org.shadab.demo.springioc;

import org.shadab.demo.service.DailyService;

public class FirstFloorRoom implements Building {
	
	private int totalRooms;
	private double totalMaintainenceCost;

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
	public String getYourDailyService() {
		return dailyService.getFloorGreeting();
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		System.out.println("Inside setter method : setTotalRooms");
		this.totalRooms = totalRooms;
	}

	public double getTotalMaintainence() {
		return totalMaintainenceCost;
	}

	public void setTotalMaintainence(double totalMaintainence) {
		System.out.println("Inside setter method : setTotalMaintainence");
		this.totalMaintainenceCost = totalMaintainence;
	}
	
	//init method for bean lifecycle test
	public void getStartup()
	{
		System.out.println("Bean created ");
	}
	
	//desrtoy bean
	public void getCleanup(){
		System.out.println("Bean destroyed");
	}
}
