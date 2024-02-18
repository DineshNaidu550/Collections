package com.dinesh.practice.javaprograms.Collections.JanuaryWeek2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();//Using Generics concept - to do : Learn about Generics
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		Stream<Integer> sequentialStream = list.stream();
		Stream<Integer> parallelStream = list.parallelStream();

		Stream<Integer> highNums = parallelStream.filter(p -> p%2 == 0);
		highNums.forEach(p -> System.out.println("High nums parallel =" + p));
		Stream<Integer> highNumsseq = sequentialStream.filter(p -> p > 90);
		highNumsseq.forEach(p -> System.out.println("High nums sequential =" + p));
	}

}
