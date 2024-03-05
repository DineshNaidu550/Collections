package com.dinesh.practice.javaprograms.Collections.March;

public class ListImplMain {

	public static void main(String[] args) {
		
		ListClass listClass = new ListClass();
		
		listClass.addElements("Hello");
		listClass.addElements("Java");
		
	//	Integer integer = new Integer(10);
		System.out.println("Elements in the list");
		listClass.getElements();

		System.out.println(" List size "+listClass.collectionSize());
		System.out.println(" Elements in the list collection after deletion");
		listClass.deleteElement("Java");
		listClass.getElements();

	}

}
