package com.dinesh.practice.javaprograms.Collections.JanuaryWeek2;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[]args) {
		HashSet<String>hs =new HashSet<String>();
		System.out.println("Size at the begining "+hs.size());
		hs.add("Sujith");
		hs.add("Ramya");
		hs.add("Vikram");
		hs .add("Mahi");
		hs.add("Hasini");
		
		System.out.println(hs);
		
		System.out.println("Size after addition "+hs.size());
		hs.remove("Mahi");

		System.out.println(hs);
		System.out.println("Size after removal "+hs.size());


	}

}
