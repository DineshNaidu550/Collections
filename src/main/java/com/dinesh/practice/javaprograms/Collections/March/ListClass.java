package com.dinesh.practice.javaprograms.Collections.March;

import java.util.ArrayList;
import java.util.List;

public class ListClass implements CollectionInterface {
	
	
	private  List<String> list;
	
	ListClass() {
		list = new ArrayList<>();
	}
		
	//@Override
	public void addElements(String s) {
		
		list.add(s);
		
	}

	@Override
	public void deleteElements() {
		// TODO Auto-generated method stub
		
	}
	public  void deleteElement(String s) {
		list.remove(s);
	}

	@Override
	public int collectionSize() {
		// TODO Auto-generated method stub
		
		return list.size();
	}

	@Override
	public void searchElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getElements() {

		list.forEach(s -> System.out.println(s));
		
	}

	@Override
	public void addElements(String s, String str) {
		// TODO Auto-generated method stub
		
	}
	

}
