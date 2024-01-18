package com.dinesh.practice.javaprograms.Collections.JanuaryWeek2;

import java.util.ArrayList;

public class ArrayListLambda {
	public static void main(String[]args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
	      al.add(1);
	      al.add(2);
	      al.add(3);
	      al.add(4);
	      
	      al.forEach(n-> System.out.println(n));
	      
	      al.forEach(n-> {
	    	  if(n%2==1)
	    		  System.out.println(n);
	      });
		
	}

}
