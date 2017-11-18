package org.shadab.demo.springioc;

public class MySpringTestApp {

	/*
	 * create the object Building floor= new FirstFloorRoom();
	 */
	public static void main(String args[]) {
		Building floor = new SecondFloorRoom();
		System.out.println(floor.getWindow());

	}

}
