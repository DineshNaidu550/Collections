package com.dinesh.practice.javaprograms.Collections.March;

import java.util.ArrayList;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println("adding values "+list);
		list.remove(0);
		System.out.println("After removing values"+list);
		System.out.println ("Size of list is "+list.size());
		
		System.out.println("To get the required value "+list.get(2));
		System.out.println("To search the value "+list.set(1, 2));
	}

}
