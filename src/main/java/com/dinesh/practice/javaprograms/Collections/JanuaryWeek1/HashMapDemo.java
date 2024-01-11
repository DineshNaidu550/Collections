package com.dinesh.practice.javaprograms.Collections.JanuaryWeek1;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String args[]) {

		HashMap<String, String> capitals = new HashMap<String, String>();
		capitals.put("Telangana", "Hyderabad");
		capitals.put("UP", "Lucknow");
		capitals.put("AP", "Amaravathi");
		capitals.put("HP", "Simla");
		capitals.put("Goa", "Panaji");
		System.out.println("States and the capitals:"+ " " +capitals);

	}

}
