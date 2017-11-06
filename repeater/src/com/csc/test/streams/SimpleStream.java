package com.csc.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addAll(	Arrays.asList(new String[] {"abc","one","two","three","next","out","orb","or","on","orb","orb"}));
		
		List<String> newList = list.stream().filter(s->s.startsWith("o")).
					  filter(s->s.length() > 2).
					  map(s->s.toUpperCase()).
					  sorted().
					  distinct().
					  collect(Collectors.toList());
		
		newList.forEach(System.out::println);
		

	}
}
