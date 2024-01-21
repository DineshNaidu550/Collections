package com.dinesh.practice.javaprograms.Collections.JanuaryWeek2;

import java.util.HashMap;
import java.util.Map;

public class MapDemoClass {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vikram", 6);
		map.put("Ramya", 4);
		map.put("Sujith", 1);
		System.out.println("Ages of the children:");
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

}
