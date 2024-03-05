package com.dinesh.practice.javaprograms.Collections.March;

public class MapImplMain {

	public static void main(String[] args) {
		MapClass mapclass = new MapClass();
		mapclass.addElements("Dinesh", "Chavadi");
		mapclass.addElements("Naidu", "Chavadi");
		mapclass.addElements("Mahi", "Chavadi");
		
		//System.out.println(mapclass.get("Dinesh"));

		System.out.println("MapCollection size: " + mapclass.collectionSize());

		System.out.println("Elements in the MapClass is");
		mapclass.getElements();

	}

}
