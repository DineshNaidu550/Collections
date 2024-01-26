package com.dinesh.practice.javaprograms.Collections.JanuaryWeek3;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		

		List<Integer> numberslist = Arrays.asList(10, 20, 32, 66, 99);
		List<Integer> evenNumbersList = new ArrayList<Integer>();

		// without using streams
		/*
		 * for(int n :numberslist) { if(n%2==0) evenNumbersList.add(n); }
		 * System.out.println(evenNumbersList);
		 */
		// with streams
		evenNumbersList = numberslist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		System.out.println(evenNumbersList);
		
		  numberslist.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
	
	}

}
