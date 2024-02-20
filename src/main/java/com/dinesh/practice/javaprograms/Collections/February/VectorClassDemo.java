package com.dinesh.practice.javaprograms.Collections.February;

import java.util.Vector;

public class VectorClassDemo {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		names.add("Shiva");
		names.add("Rama");
		names.add("Krishna");
		//System.out.println(names);
		for(String str:names) {
			System.out.println(str);
			
		}
		System.out.println(names);

	}
}