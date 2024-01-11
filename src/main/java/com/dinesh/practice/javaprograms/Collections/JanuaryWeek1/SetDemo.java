package com.dinesh.practice.javaprograms.Collections.JanuaryWeek1;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		List<Integer> list =new ArrayList<Integer>();
		names.add("Ramesh");
		names.add("Krishna");
		names.add("Suresh");
	    names.add("Surya");
	    names.remove(2);
		System.out.println(names);
	}

}
