package com.dinesh.practice.javaprograms.Collections.March;

import java.util.HashMap;
import java.util.Map;

public class MapClass implements CollectionInterface {
	private Map<String, String> map;

	MapClass() {
		map = new HashMap<>();
	}

	@Override
	public void addElements(String str,String s) {

		map.put(str,s);
	}

	@Override	
	public void deleteElements() {
		// TODO Auto-generated method stub

	}
	public void deleteElement(String str,String s) {
		map.remove(str, s);
	}

	@Override
	public int collectionSize() {
		return map.size() ;
	}

	@Override
	public void searchElements() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getElements() {

		map.forEach((str,s) -> System.out.println(str + s));
	}

	@Override
	public void addElements(String s) {
		// TODO Auto-generated method stub
		
	}

	

}
