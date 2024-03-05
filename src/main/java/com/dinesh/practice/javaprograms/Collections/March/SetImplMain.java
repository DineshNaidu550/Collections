package com.dinesh.practice.javaprograms.Collections.March;

public class SetImplMain {

	public static void main(String[] args) {
 
		SetClass sClass = new SetClass();
		sClass.addElements("Vikram");
		sClass.addElements("Ramya");
		sClass.addElements("Sujith");
		sClass.addElements("Vikram");
		sClass.addElements("A");
		sClass.addElements("M");
		
		System.out.println("Collection size"+sClass.collectionSize());
		
		sClass.getElements();
		sClass.deleteElement("M");
		System.out.println(" Elements in the set collection");
		sClass.getElements();

	}

}
