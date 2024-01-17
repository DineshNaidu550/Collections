package com.dinesh.practice.javaprograms.Collections.JanuaryWeek1;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Integer>arr =new ArrayList<>(5);
		arr.add(12);
		arr.add(22);
		arr.add(24);
		arr.add(90);
		arr.add(0);
		//printing elements
		for(Integer in: arr) {
			System.out.println("The number is :"+in);
		}
		
	}

}
