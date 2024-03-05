package com.dinesh.practice.javaprograms.Collections.March;

import java.util.HashSet;
import java.util.Set;

public class SetClass implements CollectionInterface {
	private Set<String> set;

	SetClass() {
		set = new HashSet<>();
	}

	@Override
	public void addElements(String s) {


		set.add(s);
	}

	@Override
	public void deleteElements() {

	}
	
	public void deleteElement(String s) {
		set.remove(s);
	}

	@Override
	public int collectionSize() {

		return set.size() ;
	}

	@Override
	public void searchElements() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getElements() {
		set.forEach(s -> System.out.println(s));

	}

	@Override
	public void addElements(String s, String str) {
		// TODO Auto-generated method stub
		
	}

}
