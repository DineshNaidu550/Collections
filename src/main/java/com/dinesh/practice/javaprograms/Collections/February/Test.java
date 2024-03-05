package com.dinesh.practice.javaprograms.Collections.February;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Sujith");
		al.add("Ramya");
		
		System.out.println(al);
		
		for (Object i : al) {
			System.out.println(i);

		}

	}

}
