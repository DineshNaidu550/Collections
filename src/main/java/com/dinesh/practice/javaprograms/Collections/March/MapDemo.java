package com.dinesh.practice.javaprograms.Collections.March;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("Dinesh",25);
		map.put("Vikram", 7);
		map.put("Ramya", 5);
		System.out.println(map);
		System.out.println(map.get("Dinesh"));
	}

}
